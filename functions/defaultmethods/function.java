import java.util.function.*;

class Test {
  public static void main(String args[]){
    Function<String,Integer>toInt = x -> Integer.parseInt(x);
    Function<Integer,Integer> dubbel= x -> x*2;

    toInt = toInt.andThen(dubbel);
    toInt = dubbel.compose(toInt);

    System.out.println(toInt.apply(args[0]));
  }
} 
