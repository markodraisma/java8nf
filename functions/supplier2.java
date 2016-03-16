import java.util.*;
import java.util.function.*;



class Test {
   public static void main(String args[]){
     List<String> list = getList(()->new ArrayList<>());

   }

   static <T> List<T> getList(Supplier<List<T>> supplier){
      return supplier.get();
   }
}
