import java.util.function.*;

class Test {
  public static void main(String args[]){
    BinaryOperator<Integer> plus = (x,y) -> x + y;
    Function <Integer,Integer> dubbel = x -> x * 2;
    System.out.println(plus.andThen(dubbel).apply(3,4));
  }
} 
