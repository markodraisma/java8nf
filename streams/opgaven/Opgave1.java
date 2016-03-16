import java.util.*;

class SorteerApp{
  public static void main(String args[]){
    Integer[] getallen = new Integer[Integer.parseInt(args[0])];

    Arrays.setAll(getallen, x -> x * 2);
    Arrays.sort(getallen, (x, y) -> y-x);

    for(int i:getallen){
      System.out.println(i);
    }

  }

}
