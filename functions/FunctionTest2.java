import java.util.function.*;
import java.util.*;

class FunctionTest2 {
   public static void main(String args[]){
     int x = 3;
     String y = "4";
     System.out.println(transform(x,y,a->a*1.0,Double::parseDouble,(Double a,Double b)->a/b));
   }

   private static <T1, T2, R> R transform (T1 a, T2 b, Function<T1,R> f1, Function<T2,R> f2, BinaryOperator<R> bo){
     return bo.apply(f1.apply(a),f2.apply(b));
   }

}

