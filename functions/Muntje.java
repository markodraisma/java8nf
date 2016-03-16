import java.util.Random;

public enum Muntje implements Kansspel<Muntje>{ 
  
   KOP, MUNT;
   
   private final static Muntje[] values = values(); 
   private final static Random random = new Random();

   public Muntje nextValue(){
     return values[random.nextInt(values.length)];
   }
   
   public static Muntje newInstance() {
     return values[random.nextInt(values.length)];
   }
}

