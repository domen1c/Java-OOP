/*
Domenic.class
*/

public class Domenic
{
   //Declare instance variables
   private int age;
   private double shoeSize;
   private String race;
   private String eyeColor;
   private String hairColor;
   
   //Construct a clone
   public Domenic (int domAge, double domShoeSize, String domRace,
                     String domEyeColor, String domHairColor)
   {
      age = domAge;
      shoeSize = domShoeSize;
      race = domRace;
      eyeColor = domEyeColor;
      hairColor = domHairColor;
   
   }//end Constructor
   
   //Setters
   public void setAge(int domAge)
   {
      age = domAge;
      }
      public void setShoeSize(double domShoeSize)
      {
         shoeSize = domShoeSize;
         }
         public void setRace(String domRace)
         {
            race = domRace;
            }
            public void setEyeColor(String domEyeColor)
            {
               eyeColor = domEyeColor;
               }
               public void setHairColor(String domHairColor)
               {
                  hairColor = domHairColor;
                  }
   //Getters
   public int getAge()
   {
      return age;
      }
      public double getShoeSize()
      {
         return shoeSize;
         }
         public String getRace()
         {
            return race;
            }
            public String getEyeColor()
            {
               return eyeColor;
               }
               public String getHairColor()
               {
                  return hairColor;
                  }
                  
   //toString
   public String toString()
   {
      String result;
      
      result = "Domenic's information is: " + age + " years old, and of " + race + " descent. \n" +
               "His shoe size is: " + shoeSize + " and eye color is: " + eyeColor + 
               ". \nThe color of his hair is: " + hairColor;
               
               return result;
               }
               
}//end class Domenic