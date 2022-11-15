
package triangles;

import java.util.Scanner;  // imported scanner class

public class Areas {
    


   public static void main(String args[]) 
    {   
       
      Scanner sc = new Scanner(System.in);  //importing scanner class
        
         System.out.println("Enter the width of the Triangle:");   //requesting for input width
         int b = sc.nextInt();
 
         System.out.println("Enter the height of the Triangle:");  //requesting for input height
         int h = sc.nextInt();
 
          int area=Area(b,h);   // function to get the area
      System.out.println("Area of Triangle is: " + area);      //output to get area of a triangle
   }
   static int Area(int b,int h)
{    
  return ((b*h)/2);
}
 
}