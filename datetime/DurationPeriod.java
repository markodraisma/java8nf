import java.time.*;
import java.time.temporal.*;

public class DurationPeriod {
  public static void main (String args[]){
    Instant start = Instant.now();
    try{Thread.sleep((int)(1000*Math.random()));
    } catch(InterruptedException ie){}
    Instant einde = Instant.now();
    System.out.println(Duration.between(start,einde));
    LocalDate van = LocalDate.now();
    LocalDate tot = van.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println(Period.between(van,tot));
  }
}
