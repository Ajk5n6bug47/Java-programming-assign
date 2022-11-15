
package years;

import java.util.Scanner;   //imported java scanner class

public class Years {

   public static void checkLeapYear(int year)   //java prog. method to calculate a leap year
   {
    if (year % 400 == 0) 
    {
      System.out.println(year + " This is a leap year.");
    } else if (year % 100 == 0)     // assigning input to a variable
    {
      System.out.println(year + " This is not a leap year.");
    } else if (year % 4 == 0)       // assigning input to a variable 
    {
      System.out.println(year + " This is a leap year.");
    } else {
      System.out.println(year + " This is not a leap year.");
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);   // importing a Scanner object
    System.out.println("Enter a year :");  //requesting for output (year) to check if it'45s a leap year or not

    int year = s.nextInt(); // getting user input from java command introduced
    checkLeapYear(year);
  }
}
    

