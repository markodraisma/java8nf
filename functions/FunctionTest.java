import java.util.function.*;

class FunctionTest {
   public static void main(String args[]){
        
        Naam naam = new Naam("A.F.Th", "Adri", "van der" ,"Heijden");
        System.out.println(naam);
        Naam.setToString(x->x.tussen!=null?String.format("%s %s, %s"
                            ,x.voornaam, x.achternaam,x.tussen):
                            String.format("%s %s", x.voornaam, x.achternaam)
                         );
        System.out.println(naam);

   }
}

class Naam {

  String voorletters, voornaam, tussen, achternaam;
   
  private static Function<Naam,String> toString;

  
  Naam(String voorletters, String voornaam, String tussen, String achternaam){
     this.voorletters=voorletters;
     this.voornaam=voornaam;
     this.tussen=tussen;
     this.achternaam=achternaam;
  
  }


  public static void setToString(Function<Naam,String> toString){
     Naam.toString=toString;
  }

  public String toString(){
     if(toString != null){
        return toString.apply(this);

     }
     else
       return String.format("%s %s %s %s",voorletters, voornaam, tussen, achternaam);

  }


}
