import java.util.*;
import java.util.stream.*;

class ReduceTest {

  public static void main(String args[]){
     double avg= new Random().ints(100,1,7)
                            .mapToDouble(x->x)
                            .reduce(0,(x,y) -> x+y/100);    
     System.out.printf("%3.2f%n",avg);
     System.out.println(new Random().ints(100,1,7).average().getAsDouble());
     String s = Stream.of(args)
                      .map(StringBuilder::new)
                      .reduce(new StringBuilder(),StringBuilder::append)
                      .toString();
     System.out.println(s);                      
     System.out.println(
        new Random().ints(10,1,7)
        .filter(x -> x==6)
        .reduce((x,y)->x+y)
        .orElse(-1));

  }

}

