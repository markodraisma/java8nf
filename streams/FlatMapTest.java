import java.util.*;
import java.util.stream.*;

class FlatMapTest {

  public static void main(String args[]){
    Integer[][] square = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

    Stream.of(square)
          .peek(row -> System.out.println(Arrays.toString(row)))
          .flatMap(row -> Stream.of(row))
          .filter(i -> i%4==0)
          .forEach(System.out::println);
    
    List<Adres> adressen = new ArrayList<>();
    adressen.add(new Adres("1234AB","10","Jan","Jans","Karlijn","Catootje"));
    adressen.add(new Adres("2345CD","9","Tommie","Pino"));
    adressen.add(new Adres("3456DE","8","Olivier B. Bommel","Joost"));
    adressen.stream()
            .flatMap(adres -> adres.bewoners.stream())
            .filter(s -> s.contains("o"))
            .forEach(System.out::println);


  }

}

class Adres{
  String postcode, huisnummer;
  List<String> bewoners = new ArrayList<>();
  Adres(String postcode, String huisnummer, String... bewoners){
     this.postcode=postcode;
     this.huisnummer=huisnummer;
     Collections.addAll(this.bewoners,bewoners);
  }
  
}
