interface Range {
  int getLowerBound();
  int getUpperBound();

  default int pctInRange(int value){
    int range = getUpperBound()-getLowerBound();
    double pct = (double) (value - getLowerBound())/range * 100;
    return (int)pct;
  }

  static Range of (int x, int y){
    return new Range(){ // anonieme inner class
      public int getLowerBound(){ return x<y?x:y; }
      public int getUpperBound(){ return x>y?x:y; }
    };
  }
}

class Fahrenheit  {
  public final static int VRIESPUNT = 32;
  public final static int KOOKPUNT = 212;
  private int graden;

  Fahrenheit(int graden){
    this.graden=graden;
  }

  public int getGraden(){
    return graden;
  }
  
}

class RangeApp {
  public static void main(String args[]){

  }
}
