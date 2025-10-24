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
        
        System.out.println("\n--- X: " + x + " | Y: " + y + " | Z: " + z + " ---");


        System.out.println("Checking that both x and y are not negative ... ");
        if (!(x < 0) && !(y < 0)) {
            System.out.println("Both x and y are not negative");
        }
        
        /* your code here */ 

        // Step 6: Create a new if statement that uses a logical OR (||).
        // Condition: Check if X is less than or equal to Y, OR if Z is less than X.
        if (x <= y || z < x) 
        {
            System.out.println("\nCondition (x <= y || z < x) is TRUE.");
        }
        else
        {
            System.out.println("\nCondition (x <= y || z < x) is FALSE.");
        }
        

        /*
         * Comment where short-circuit evaluation could occur and describe how it could occur.
         */
         
        // **Short-Circuit Evaluation for the OR (||) operator:**
        
        // Short-circuit evaluation occurs in the condition: (x <= y || z < x).
        
        // **How it could occur:** // Java evaluates the conditions from left to right. If the first condition, (x <= y), 
        // evaluates to **TRUE**, the entire OR expression is guaranteed to be TRUE. 
        // Therefore, the Java runtime will **skip** evaluating the second condition, (z < x), 
        // because the final result is already determined. This saves processing time 
        // and is called short-circuit evaluation.
        

        sc.close();
    }
}