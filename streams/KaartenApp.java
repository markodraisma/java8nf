import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import java.util.function.*;

class KaartenApp {


  public static void main(String args[]){
   List<Card> kaarten =
               Stream.of("harten","klaver","schoppen","ruiten")
               .flatMap(
                  s -> Stream.concat(
                        Stream.iterate(1,x->x+1)
                              .limit(10)
                              .map(i -> Integer.toString(i))
                        ,                        
                        Stream.of("boer","vrouw","koning","aas"))                                   .map(x -> new Card(s,x)))
               .collect(toList());
  Collections.shuffle(kaarten);
  System.out.println(kaarten.stream()
                            .findAny()
                            .get());

  }

}

class Card {
  String value, color;

  Card(String color, String value){
    this.value=value; this.color=color;
  }

  public String toString(){
    return String.format("[%s %s]",color,value);
  }

}
