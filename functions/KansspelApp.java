class KansspelApp {

   public static void main(String args[]){
      KansspelFactory factory = KansspelFactory.factory();

      Kansspel<Muntje> munt1 = factory.of(Muntje::newInstance); 
      Kansspel<Muntje> munt2 = factory.of(Muntje::newInstance); 
      
      System.out.println(munt1.score(munt2, (x,y)->x==y?"gelijk":
                                                   x==Muntje.KOP?"gewonnen":
                                                   "verloren"));

      System.out.println(munt1.score(x->true,x->x==Muntje.MUNT?1:-1,100));
      Kansspel<Integer> dobbelsteen1 = factory.of(Dobbelsteen::new);
      System.out.println(dobbelsteen1.score(x->x%2==0,x->{
        switch(x){
          case 2: return 1;
          case 4: return 5;
          case 6: return 10;
          default: return 0;
        }
        },100));     
      Kansspel<Integer> dobbelsteen2 = factory.of(Dobbelsteen::new);
      System.out.println(dobbelsteen1.score(dobbelsteen2, (x,y)->x-y));
   }
}
