
package avarage;

import java.util.Scanner;  //importing scanner class
public class Avarage {

    
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);   // importing scanner class
      System.out.print("Marks for Java programming :");   // requesting for input (java prog.)
      double num1 = in.nextDouble();   // assigning input to a variable (java prog.)
      System.out.print("Marks for Networking :");   // requesting for input (networking.)
      double num2 = in.nextDouble();   // assigning input to a variable (networking.)
      System.out.print("Marks for Maths :");    // requesting for input (maths.)
      double num3 = in.nextDouble();    // assigning input to a variable (maths.)
      System.out.print("This is the avarage value:"+average(num1,num2,num3)+"\n"); //output the average value.
    }

     public static double average(double num1,double num2,double num3) 
     {
         return (num1 + num2 + num3)/3; // function to calculate average
     }
}