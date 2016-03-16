interface Range {
   int getLower();
   int getHigher();

   default int pctInRange(int value){
     int range = getHigher()-getLower();
     double pct = (double) (value - getLower())/range * 100;
     return (int)pct;  
   }

   static Range of (int x, int y){
     return new Range(){
        public int getLower(){ return x<y?x:y; }
        public int getHigher(){ return x>y?x:y; }
     };
   }
}

class Test {
  public static void main (String args[]){
     Range x = Range.of(0, 10);
     System.out.println(x.pctInRange(4));
  }
}
