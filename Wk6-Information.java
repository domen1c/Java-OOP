/*
Driver for Domenic class
*/


public class Information
{
   public static void main (String[] args)
   {
      //Create an object from the Domenic class
      Domenic domenic1 = new Domenic(32, 10.5, "Caucasian", "Brown", "Pink");
      
      //Output through System.out
      System.out.println (domenic1);
      
      System.out.println ();
      System.out.println ();
      
      domenic1.setAge (500);
      domenic1.setRace ("Alien");
      domenic1.setEyeColor ("Black");
      domenic1.setHairColor ("Bald");
      
      System.out.println ("Processing object changes...");
      System.out.println ("Processing object changes..");
      System.out.println ("Processing object changes.");
      
      System.out.println ();
      System.out.println ();
      
      System.out.println ("The true colors of Domenic!");
      System.out.println (domenic1);

   }//end main method
   
}//end class Information
