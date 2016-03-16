import java.util.function.*;


class BinaryOperatorTest2 {
   public static void main (String args[]){
     System.out.println(compound(1,new int[]{1,2,3,4,5},(x, y)->x*y));
     System.out.println(compound(0,new int[]{1,2,3,4,5},(x, y)->x+y));
     System.out.println(compound(1000,new int[]{1,2,3,4,5},(x, y)->x/y));

     //System.out.println(compound("",args,(x,y)->x+(x.length()>0?" "+y:y)));
   }
   
   static int compound(int seed, int[] values, BinaryOperator<Integer> bo){
     int previous=seed;
     int result=seed;
     for(int value: values){
       result = bo.apply(previous,value);
       previous=result;
     }
     return result;
   }

/*
   static <T> T compound(T seed, T[] values, BinaryOperator<T> bo){
     T previous=seed;
     T result=seed;
     for(T value: values){
       result = bo.apply(previous,value);
       previous=result;
     }
     return result;
   }
*/

}
