import java.util.function.*;
import java.util.*;
enum Aanroep { M("Dhr."), V("Mevr.");
  private final String s;
  Aanroep(String s){this.s=s;}
  public String toString(){ return s; }

}
class Naam implements Comparable<Naam> {
  String voornaam;
  String achternaam;
  String voorletters;
  Aanroep aanroep;
  static Optional<BiFunction<Naam,Naam,Integer>> comparable=Optional.empty();
  static Optional<Function<Naam,String>> toString=Optional.empty();

  Naam(Aanroep aanroep, String voorletters, String voornaam, String achternaam){
    this.aanroep=aanroep;
    this.voorletters=voorletters;
    this.voornaam=voornaam;
    this.achternaam=achternaam;
  }



  public static void setComparable(BiFunction<Naam,Naam,Integer> comparable){
    Naam.comparable=Optional.of(comparable);
  }

  public static void setToString(Function<Naam,String> toString){
    Naam.toString=Optional.of(toString);
  }

  @Override
    public int compareTo(Naam n){
      if(comparable.isPresent())
        return comparable.get().apply(this,n);
      else
        return this.achternaam.compareTo(n.achternaam); 
          
    } 

  @Override
    public String toString(){
      if(toString.isPresent()) return toString.get().apply(this);
          else
          return String.format("%s %s %s %s",
            aanroep,
            voorletters,
            voornaam,
            achternaam);
    }
}
