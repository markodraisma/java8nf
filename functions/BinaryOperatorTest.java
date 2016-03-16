import java.util.function.*;

enum Reken implements BinaryOperator<Integer>  {

  PLUS((x, y) -> x + y),
  MIN((x, y) -> x - y),
  KEER((x, y) -> x * y),
  DEEL((x,y) -> x / y);

  private BinaryOperator<Integer> bo;

  @Override
  public Integer apply(Integer a, Integer b){
    return bo.apply(a,b);
  }

  Reken(BinaryOperator<Integer> bo){
    this.bo=bo;
  }

}

class BinaryOperatorTest {
   public static void main (String args[]){
      System.out.println(Reken.KEER.apply(6,3));
      System.out.println(Reken.PLUS.apply(6,3));
      System.out.println(Reken.MIN.apply(6,3));
      System.out.println(Reken.DEEL.apply(6,3));
   }
}
