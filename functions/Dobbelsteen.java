import java.util.Random;
public class Dobbelsteen implements Kansspel<Integer> {
   private final static Random random = new Random();

   public Integer nextValue(){
     return random.nextInt(6)+1;
   }
}
