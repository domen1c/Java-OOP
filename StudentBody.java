/***
 * Author:	Domenic Mangani			Date: November 7, 2013
 * Class:	COP 2551                Filename: StudentBody.java
 * Lab:		Lab 5
 * Purpose: Driver for Student objects.
 ***/

public class StudentBody 
{   
   // Creates some Address and Student objects and prints them.   
   public static void main (String[] args)
   {
      Address school = new Address ("800 Lancaster Ave.", 
                                    "Villanova", "PA", 19085);
      Address jHome = new Address ("21 Jump Street", 
                                   "Lynchburg", "VA", 24551);
      Address mHome = new Address ("123 Main Street", 
                                   "Euclid", "OH", 44132);                                                                    
      Student john = new Student ("John", "Smith", jHome, school);
      
      Student marsha = new Student ("Marsha", "Jones", mHome, school);      
      
      //Lab5 
      Address mySchool = new Address ("11901 Beach Blvd", 
                                      "Jacksonville", "FL", 32246);
      Address domHome = new Address ("915 3rd Avenue North", 
                                     "Jax Beach", "FL", 32250);
      Address jenHome = new Address ("2010 Hopkins Street", 
                                     "Neptune Beach", "FL", 32266);
      
      Student dom = new Student ("Domenic", "Mangani", domHome, 
                                 mySchool, 100, 99, 75);
      Student jen = new Student ("Jennifer", "Tomkowich", jenHome, 
                                 mySchool, 100, 95, 99);      
      
      //Output all four students      
      System.out.println (john);
      System.out.println ();
      System.out.println (marsha);
      System.out.println ();
      System.out.println (dom);
      System.out.println ();
      System.out.println (jen);
      System.out.println ();
      
      //setTestScore for John and Marsha 
      john.setTestScore(1, 50);
      john.setTestScore(2, 55);
      john.setTestScore(3, 75);      
      marsha.setTestScore(1, 100);
      marsha.setTestScore(2, 99);
      marsha.setTestScore(3, 95);
      
      //Reprint with new test scores
      System.out.println ("John's updated scores: Test 1: " + john.getTestScore(1)
                          + ", Test 2: " + john.getTestScore(2) + ", Test3: " +
                          john.getTestScore(3) + ", Average: " + john.average() +
                          " (" + john.gradeLetter() + ")");
      System.out.println ();
      System.out.println ("Marsha's updated scores: Test 1: " + marsha.getTestScore(1)
                          + ", Test 2: " + marsha.getTestScore(2) + ", Test3: " +
                          marsha.getTestScore(3) + ", Average: " + marsha.average() +
                          " (" + marsha.gradeLetter() + ")");
      
   }//end main method
}//end StudentBody class

/* Output:

 John Smith
 Home Address:
 21 Jump Street
 Lynchburg, VA  24551
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Average = 0 (F) with Tests: 0, 0, and 0.
 
 Marsha Jones
 Home Address:
 123 Main Street
 Euclid, OH  44132
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Average = 0 (F) with Tests: 0, 0, and 0.
 
 Domenic Mangani
 Home Address:
 915 3rd Avenue North
 Jax Beach, FL  32250
 School Address:
 11901 Beach Blvd
 Jacksonville, FL  32246
 Average = 91 (A) with Tests: 100, 99, and 75.
 
 Jennifer Tomkowich
 Home Address:
 2010 Hopkins Street
 Neptune Beach, FL  32266
 School Address:
 11901 Beach Blvd
 Jacksonville, FL  32246
 Average = 98 (A) with Tests: 100, 95, and 99.
 
 John's updated scores: Test 1: 50, Test 2: 55, Test3: 75, Average: 60 (D)
 
 Marsha's updated scores: Test 1: 100, Test 2: 99, Test3: 95, Average: 98 (A)
 
 */
