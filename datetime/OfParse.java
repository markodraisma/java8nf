import java.time.*;

public class OfParse {
  public static void main (String args[]){
    LocalDate vandaag = LocalDate.of(2015,9,25);
    // pas op: niet 09, is octaal getal.
    LocalDate morgen = LocalDate.of(2015,Month.SEPTEMBER, 26);
    // enum java.time.Month
    LocalDate zondag = LocalDate.parse("2015-09-27");
    LocalTime lunch = LocalTime.of(12,0,0);
    LocalTime theetijd = LocalTime.parse("14:30:00");
    System.out.println(vandaag);
    System.out.println(morgen);
    System.out.println(zondag);
    System.out.println(lunch);
    System.out.println(theetijd);
  }
}
