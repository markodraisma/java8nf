import java.util.function.*;

   interface KansspelFactory {

   static KansspelFactory factory(){
     return new KansspelFactory(){};
   }

   default <T> Kansspel<T> of(Supplier<Kansspel<T>> supplier){
      return supplier.get();
   }

}
