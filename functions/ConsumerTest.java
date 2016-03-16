import java.util.function.*;
import java.util.*;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

class Artikel {

  private String naam;
  private float prijs;
  private LocalDate verkocht;

  public Artikel(String naam, float prijs){
    this.naam=naam;
    this.prijs=prijs;
  }

  public void setNaam(String naam) {
    this.naam=naam;
  }

  public String getNaam(){
    return naam;
  }

  public void setPrijs(float prijs){
    this.prijs=prijs;
  }

  public float getPrijs(){
    return prijs;
  }

  public void setVerkocht(LocalDate verkocht){
    this.verkocht = verkocht;
  }

  public void setVerkocht(int y, int m, int d){
    this.verkocht = LocalDate.of(y,m,d);
  }

  public int laatstVerkocht(){
     LocalDate vandaag = LocalDate.now();
     return (int)DAYS.between(verkocht,vandaag);
  }

  public String toString(){
    return String.format("[%s: %,3.2f]",naam,prijs);
  }

}


class ConsumerTest {
   public static void main (String args[]){
     Artikel a1 = new Artikel ("pen", 1.5f);
     a1.setVerkocht(2014,5,1);
     Artikel a2 = new Artikel ("potlood", 1.3f);
     a2.setVerkocht(LocalDate.now());
     List<Artikel> artikelen = new ArrayList<>();
     artikelen.add(a1);
     artikelen.add(a2);
     bewerk(artikelen, 
            a -> a.laatstVerkocht()>30, 
            a -> a.setPrijs(a.getPrijs()*.9F));
     System.out.println(artikelen);

   }


   public static void bewerk(List<Artikel> lijst, 
                             Predicate<Artikel> p, 
                             Consumer<Artikel> c){
       for(Artikel a:lijst){
         if(p.test(a)){
           c.accept(a);
         }
       }
   }

}
