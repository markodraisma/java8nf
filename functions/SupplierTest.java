import java.util.function.*;

class A {
  private int id;
  private static int hoogste=0;
  
  private A(int id){
   this.id=id;
  }

  public String toString(){
    return String.format("A(%s)",id);
  }

  static Supplier<A> getNextA = () -> new A(++hoogste);
  
  static Function<Integer,A> getA = x -> new A(x>hoogste?hoogste=x:++hoogste);
}


class SupplyerTest {
   public static void main(String args[]){
      for (int i=0;i<5;i++){
         System.out.println(A.getNextA.get());
      }
      
      System.out.println(A.getA.apply(10));
      System.out.println(A.getNextA.get());

   }

}
