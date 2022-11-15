
package method.in.java;

import java.util.Scanner;  // imported scanner class 

public class Method {
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);   // importing scanner class 
       
        int small, large;
        
        
        System.out.print("Enter number one:");  // requesting for input (number one)
        int num1 = sc.nextInt();  // assigning input to a variable integer
        
        System.out.print("Enter number two:");    // requesting for input (number two)
        int num2 = sc.nextInt();   // assigning input to a variable integer
        
        System.out.print("Enter number three:");     // requesting for input (number three)
        int num3 = sc.nextInt(); // assigning input to a variable integer
        
   
        num1 = sc.nextInt();    // function to get the largest and smallest number 

        small = num1;
        large = num1;

       num2 = sc.nextInt();

        if (small < num2)
        {
            large = num2;
        }

        else 
        {
            small = num2;
        }
        num3 = sc.nextInt();

        if  (small < num3)
        {
            large = num3;
        }

        else
        {
            small = num3;
        } 
         System.out.printf("%d is smallest and %d is largest", small,large);  //output to display the largest and smallest number      

    }   
}
