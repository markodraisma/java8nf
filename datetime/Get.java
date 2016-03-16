import java.time.*;
import static java.time.temporal.ChronoField.*;

public class Get{
  public static void main(String args[]){
    LocalDateTime nu = LocalDateTime.now();
    System.out.println("Jaar:   " + nu.get(YEAR));
    System.out.println("Maand:  " + nu.get(MONTH_OF_YEAR));
    System.out.println("Dag:    " + nu.get(DAY_OF_MONTH));
    System.out.println("Week:   " + nu.get(ALIGNED_WEEK_OF_YEAR));
    System.out.println("Uur:    " + nu.get(HOUR_OF_DAY));
    System.out.println("Minuut: " + nu.get(MINUTE_OF_HOUR));

  }
}
