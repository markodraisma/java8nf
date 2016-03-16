import java.time.*;
import java.time.format.*;

public class Formatters {
  public static void main (String args[]){
    LocalDateTime nu = LocalDateTime.now();
    DateTimeFormatter dtf1 = DateTimeFormatter
                               .ofPattern("dd MMMM yyyy HH:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter
                               .ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter dtf3 = DateTimeFormatter
                               .ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter dtf4 = DateTimeFormatter
                               .ofLocalizedDate(FormatStyle.LONG);
    DateTimeFormatter dtf5 = DateTimeFormatter
                               .ofLocalizedDate(FormatStyle.FULL);
                                               
    System.out.printf("Het is nu: %s%n", nu.format(dtf1));
    System.out.printf("Het is nu: %s%n", nu.format(dtf2));
    System.out.printf("Het is nu: %s%n", nu.format(dtf3));
    System.out.printf("Het is nu: %s%n", nu.format(dtf4));
    System.out.printf("Het is nu: %s%n", nu.format(dtf5));
  }
}
