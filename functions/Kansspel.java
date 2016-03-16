import java.util.function.*;

interface Kansspel<T> {
   
   T nextValue();

   default int score(Predicate<T> p, ToIntFunction<T> f,  int beurten ){
     int totaal = 0;
     for(int i=0;i<beurten;i++){
         if(p.test(nextValue())){
           totaal+=f.applyAsInt(nextValue());
         }
     }
     return totaal;
   }

   
   default <R> R score(Kansspel<T> other, BiFunction<T,T,R> score ){

     return score.apply(this.nextValue(),other.nextValue());

   }

   static Kansspel of(Supplier<Kansspel> supplier){
     return supplier.get();
   }

}
