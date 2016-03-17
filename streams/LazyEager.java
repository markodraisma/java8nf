import java.util.*;
import java.util.function.*;

class LazyEager {

   static <T> Builder<T> of(List<T> list){
     return new Builder<T>(list);
   }

   public static class Builder<E>{
      private List<E> list;
      private Predicate<E> filter;
      private Consumer<E> consumer;

      private Builder(List<E> list){
        this.list=list;
      }

      public Builder<E> filter(Predicate<E> filter){
        this.filter=filter;
        return this;
      }

      public void forEach(Consumer<E> consumer){
        for(E e:list){
          if(filter.test(e)){
            consumer.accept(e);
          }
        }
        this.list=null;
        this.filter=null;
        this.consumer=null;
      }
   }
}

class LazyEagerTest {
  public static void main(String args[]){
    LazyEager.of(Arrays.asList(args))
             .filter(s->s.length()%2==0)
             .forEach(s->System.out.println(s));

  }
}
