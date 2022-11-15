
package constructor;

public class Constructor
{
       Constructor()    // Calling non-static method
    {
        int num1;
        System.out.println("Enter number:");
        display();
    }
 
    void display()
    {
        System.out.println("Non static method :");   // Print statement whenever non-static method is called
    }

    public static void main(String[] a) { new Constructor(); }
}