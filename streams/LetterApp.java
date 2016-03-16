import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import static java.util.stream.Collectors.*;

class LetterApp {

  public static void main(String args[]){
    String eerste = Stream.of(args).min(String::compareTo).get();
    System.out.println(eerste);
    String letters = Stream.of(args)
          .flatMapToInt(String::chars)
          .distinct()
          .sorted()
          .mapToObj(i -> (char)i)
          .collect(StringBuilder::new
                  ,StringBuilder::append
                  ,StringBuilder::append)
          .toString();
    System.out.println(letters); 
  }

}
