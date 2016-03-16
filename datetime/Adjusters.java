import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class Adjusters {
  public static void main (String args[]){
    LocalDateTime nu = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter
                           .ofLocalizedDate(FormatStyle.LONG);
    DateTimeFormatter dtft = DateTimeFormatter
                            .ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.SHORT);
    
    LocalDateTime volgendeWoensdag = 
       nu.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))
         .minusHours(2);
    LocalDate eersteMaandagVolgendeMaand = LocalDate.from(nu)
                                                    .with(TemporalAdjusters.firstDayOfNextMonth())
                                                    .with(TemporalAdjusters
                                                         .firstInMonth(DayOfWeek.MONDAY));
    final TemporalAdjuster TWEE_WEKEN_LATER = TemporalAdjusters.ofDateAdjuster(day -> day.plusWeeks(2));
    System.out.println("Woensdag, 2 uur eerder: " + dtft.format(volgendeWoensdag));
    System.out.println("Eerste maandag volgende maand: " + dtf.format(eersteMaandagVolgendeMaand));
    System.out.println("Vandaag over twee weken: " + dtf.format(nu.with(TWEE_WEKEN_LATER)));
  }
}
