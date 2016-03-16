import java.util.function.*;

class Test {
  public static void main(String args[]){
    Consumer<Integer> toon = x -> System.out.println(x);
    Consumer<Integer> dubbel = x -> System.out.println(x*2);

    dubbel = toon.andThen(dubbel);

    dubbel.accept(5);
  }
} 
