/*
 * Activity 1.3.6
 * Creates a logical OR statement and discusses short-circuit evaluation.
 */
import java.util.Scanner; 

public class DeMorgansLawGTLT
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // *Correction:* Input must use sc.nextInt() for int variables (not sc.nextBoolean())
        System.out.println("Enter a number for X");
        int x = sc.nextInt(); 

        System.out.println("Enter a number for Y");
        int y = sc.nextInt();
        
        // *Add Z for a complex OR statement (as done in previous steps)*
        System.out.println("Enter a number for Z");
        int z = sc.nextInt();
        
        System.out.println("--- X: " + x + " | Y: " + y + " | Z: " + z + " ---");


        System.out.println("checking... if y and x arent negative");
        if (!(x < 0) && !(y < 0)) {
            System.out.println("Both x and y are not negative");
        }
        
        if (x <= y || z < x) 
        {
            System.out.println("Condition (x <= y || z < x) is TRUE.");
        }
        else
        {
            System.out.println("Condition (x <= y || z < x) is FALSE.");
        }
        
        

        sc.close();
    }

}
