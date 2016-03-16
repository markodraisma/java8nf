import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import static java.util.stream.Collectors.*;

class PeekTest {

  public static void main(String args[]){
    Arrays.stream(args)
      .peek(s -> {if(s.length()<=3)System.out.println(s);})
      .filter(s -> s.length()>3)
      .limit(2)
      .map(String::toUpperCase)
      .forEach(System.out::println);

  }

}
