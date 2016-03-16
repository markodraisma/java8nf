import java.util.function.*;
import java.util.*;

class PredicateTest {
   public static void main (String args[]){
     System.out.println(filter(args, s -> s.length()>3));
     System.out.println(filter(args, s -> s.indexOf("i")>0));
   }

   private static List<String> filter(String[] woorden, Predicate<String> p){
      List<String> lijst = new ArrayList<>();
      for(String s: woorden){
        if(p.test(s)){
          lijst.add(s);
        }
      }
      return lijst;
   }
}
