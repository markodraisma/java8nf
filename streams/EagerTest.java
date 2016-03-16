import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class EagerTest {
  public static void main(String args[]){
    
    int[] array1 = IntStream.range(1,3).toArray();
    Integer[] array2 = Stream.of(1,2,3).toArray(Integer[]::new);
    Object[] array3 = Stream.of(1,2,3).toArray();
    int max = Stream.of(3,6,2,4,8).max((x,y)->x-y).get();
    long aantal = Stream.of(6,3,2,4,8).count();
    int mediaan = Stream.of(6,3,2,4,8).sorted().skip(aantal/2).findFirst().get();
    boolean deelbaar = Stream.of(6,3,2,4,8).anyMatch(x -> x%2==0&&x%3==0);
    
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
    System.out.println(Arrays.toString(array3));
    System.out.println(max);
    System.out.println(aantal);
    System.out.println(mediaan);
    System.out.println(deelbaar);

  }

}
