import java.time.*;
import java.time.temporal.*;
import static java.time.temporal.TemporalQueries.*;

public class Query {
  public static void main (String args[]){
    ZonedDateTime nu = ZonedDateTime.now();
    System.out.println(nu.query(localDate()));
    System.out.println(nu.query(localTime()));
    System.out.println(nu.query(offset()));
    System.out.println(nu.query(precision()));
    System.out.println(nu.query(zone()));
    System.out.println(nu.query(Query::workingDay));
    System.out.println(nu.query(Query::timeLeft));
  }

  private static boolean workingDay(TemporalAccessor ta){
    long day = ta.getLong(ChronoField.DAY_OF_WEEK);
    return day>=1 && day<=5;
  }

  private static Duration timeLeft(TemporalAccessor ta){
    LocalDateTime ltd = LocalDateTime.from(ta);
    LocalDateTime todayAtFour = ltd.with(ChronoField.HOUR_OF_DAY,16)
                                   .with(ChronoField.MINUTE_OF_HOUR,0);
    return Duration.between(ltd,todayAtFour);
  }

}
