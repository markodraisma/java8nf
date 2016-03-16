import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class IntStreamTest {
  public static void main(String args[]){
     IntSummaryStatistics stats = 
     IntStream.rangeClosed(1,100)
              .map(x -> x%2==0?x-1:x)
              .distinct()
              .peek(System.out::println)
              .summaryStatistics();
 
     System.out.println("Totaal:    " + stats.getSum());
     System.out.println("Aantal:    " + stats.getCount());
     System.out.println("Gemiddeld: " + stats.getAverage());
     System.out.println("Hoogste:   " + stats.getMax());
     System.out.println("Laagste:   " + stats.getMin());
  }
}
