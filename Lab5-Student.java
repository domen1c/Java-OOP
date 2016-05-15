/***
 * Author:	Domenic Mangani			Date: November 7, 2013
 * Class:	COP 2551                Filename: Student.java
 * Lab:		Lab 5
 * Purpose: Reprents a student object. Includes a standard and
 *          overloaded constructor, getter/setter for test
 *          scores, and a method to calculate averages.
 ***/

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test1, test2, test3; 

   // Standard Student Constructor
   public Student (String first, String last, Address home, Address school)                   
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      
   }//end Standard Student Construct
   
   // Overloaded Student Constructor
   public Student (String first, String last, Address home, Address school,
                   int ts1, int ts2, int ts3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      
      test1 = 0;
      test2 = 0;
      test3 = 0;
            
      test1 = ts1;
      test2 = ts2;
      test3 = ts3;
      
   }//end Overload Construct
   
   // Setter for setTestScore(test#, score) 
   public void setTestScore(int testNum, int testScore)
   {
      if(testNum == 1)
      { test1 = testScore; }    
      else if(testNum == 2)
      { test2 = testScore; }    
      else if(testNum == 3)
      { test3 = testScore; }
           
   }//end setTestScore
   
   // Getter for getTestScore
   public int getTestScore(int testNum)
   {
     int testScore = 0;
     
      if(testNum == 1)
      { testScore = test1; } 
      else if(testNum == 2)
      { testScore = test2; }
      else if (testNum == 3)
      { testScore = test3; }
         
     return testScore;
     
   }//end getTestScore  
   
   // Method to average test scores
   public int average()
   {
     int average = (test1 + test2 + test3) / 3;
     return average;
      
   }//end average method
   
   // Method to convert test scores to grade letters (for fun)
   public char gradeLetter()
   {
     int average = (test1 + test2 + test3) / 3;
     char grade;

        if (average >= 90) 
        { grade = 'A'; }
        else if (average >= 80) 
        { grade = 'B'; }
        else if (average >= 70) 
        { grade = 'C'; }
        else if (average >= 60) 
        { grade = 'D'; } 
        else 
        { grade = 'F'; }
        
   return grade;
            
   }//end gradeLetter method
      
   // toString Returns a string description of this Student object.   
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress + "\n";
      result += "Average = " + average() + " (" + gradeLetter() + ") with Tests: " + test1 + ", " +
                test2 + ", and " + test3 + ".";

      return result;
      
   }//end toString method
   
}//end Student class
