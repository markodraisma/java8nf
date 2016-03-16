import java.util.*;
import java.util.function.*;
class TestNaam{
  public static void main(String args[]){
    Naam Marko = new Naam (Aanroep.M, "M.F.L.", "Marko", "Draisma");
    Naam Jip = new Naam (Aanroep.V, "J.I.", "Jip", "Irene");
    Naam Tobias = new Naam (Aanroep.M, "T.T.", "Tobias", "Tijmen");
    BiFunction<Naam,Naam,Integer> comparable = (x,y) ->x.voornaam.compareTo(y.voornaam);
    Naam.setComparable(comparable);
    List<Naam> list = new ArrayList<>();
    list.add(Marko);
    list.add(Jip);
    list.add(Tobias);
    Collections.sort(list);
    System.out.println(list);
    comparable = (x,y) -> x.achternaam.compareTo(y.achternaam);
    Naam.setComparable(comparable);
    Naam.setToString((x)->String.format("%s, %s",x.achternaam, x.voornaam));
    Collections.sort(list);
    System.out.println(list);

  }
}

