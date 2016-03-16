import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class MapTest {

  public static void main(String args[]){
    Stream.of(args)
          .map(StringBuilder::new)
          .map(StringBuilder::reverse)
          .forEach(System.out::println);

    System.out.println("totale lengte: "+
    Stream.of(args)
          .mapToInt(String::length)
          .sum());
    
  }


}

