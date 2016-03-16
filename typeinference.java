import java.util.function.*;


class Test {
  public static void main(String args[]){
    doe(1,(Integer x)->x*2);
  }
  static <T> void doe(T t, Function<T,T> functie){
      System.out.println(functie.apply(t));
  }
  static <T> void doe(T t, Consumer<T> consumer){
      consumer.accept(t);
  }
}
