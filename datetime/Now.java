import java.time.*;

public class Now {
  public static void main (String args[]){
    LocalDate vandaag = LocalDate.now();
    LocalTime nu = LocalTime.now();
    LocalDateTime nuVandaag = LocalDateTime.now();
    ZonedDateTime nuInZoneNaam = ZonedDateTime.now();
    OffsetDateTime nuInZoneTovUTC = OffsetDateTime.now();
    System.out.println(vandaag);
    System.out.println(nu);
    System.out.println(nuVandaag);
    System.out.println(nuInZoneNaam);
    System.out.println(nuInZoneTovUTC);
  }
}
