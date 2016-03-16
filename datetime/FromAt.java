import java.time.*;

public class FromAt {
  public static void main (String args[]){
    LocalDate vandaag = LocalDate.now();
    YearMonth ym = YearMonth.from(vandaag); // alle info beschikbaar
    LocalDateTime ldt = vandaag.atTime(LocalTime.now()); //info toevoegen 
    ZonedDateTime zdt = vandaag.atStartOfDay(ZoneId.systemDefault());
    ZonedDateTime zda = ZonedDateTime.of(ldt,ZoneId.of("Europe/Amsterdam"));
    System.out.println(vandaag);
    System.out.println(ym);
    System.out.println(ldt);
    System.out.println(zdt);
    System.out.println(zda);
  }
}
