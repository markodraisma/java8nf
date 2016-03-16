import java.util.*;
import java.util.function.*;


  // toepassen van method op arguments:
  // static     - alle arguments worden doorgegeven als arguments aan method reference
  // non-static - method reference wordt aangeroepen vanaf eerste argument op overige arguments

class MethodRefTest {
  public static void main(String args[]){
    bewerk("abc", x -> x.toUpperCase());
    bewerk("abc", String::toUpperCase);

    String tekst = "test";
    bewerk("je", x -> tekst.concat(x));
    bewerk("je", tekst::concat);

    bewerk(10.5, x -> Math.sqrt(x));
    bewerk(10.5, Math::sqrt);

    array(5, x -> new String[x]);
    array(5, String[]::new);
    
    maak(()->new Object());
    maak(Object::new);
    
    voerUit(tekst,x -> System.out.println(x));
    voerUit(tekst,System.out::println);
    
    pasToe(3,4,(x,y) -> Math.max(x,y));
    pasToe(3,4,Math::max);

    pasToe("test","je",(x,y) -> x.concat(y));
    pasToe("test","je",String::concat);
  }

  public static <T,R> void bewerk(T t , Function<T,R> functie){
       System.out.println(functie.apply(t));
  }

  public static <T,R> void array(T t , Function<T,R[]> functie){
       System.out.println(Arrays.toString(functie.apply(t)));
  }

  public static <T> void maak(Supplier<T> supplier){
       System.out.println(supplier.get());
  }


  public static <T> void voerUit(T t, Consumer<T> consumer){
       consumer.accept(t);
  }

  public static <T> void pasToe(T t1, T t2, BinaryOperator<T> operator) {
      System.out.println(operator.apply(t1,t2));
  }

}
