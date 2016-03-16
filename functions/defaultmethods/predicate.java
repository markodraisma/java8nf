import java.util.function.*;

class Test {
  public static void main(String args[]){
    Predicate<Integer> p = x -> x > 10;
    p = p.and(x -> x%2==0);       // logical and
    Predicate<Integer> p2 = x -> x <=10;
    p2 = p2.and(x -> x%2==1);
    p=p.or(p2);                   // logical or
    for(int x=5;x<15;x++){
      if(p.negate().test(x)){     // logical not
        System.out.println(x);
      }
    }
  }
} 
