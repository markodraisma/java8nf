import java.util.*;

class Test {
  public static void main(String args[]){

    Optional<String> arg = Optional.empty();
    if(args.length>0) {
      arg = Optional.ofNullable(args[0])
                         .map(String::toUpperCase);
    }
    
    System.out.println(arg.orElse("leeg"));


  }
}
