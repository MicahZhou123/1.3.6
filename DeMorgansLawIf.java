/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLawIf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'true' or 'false' for A");
        boolean a = sc.nextBoolean();

        System.out.println("Enter 'true' or 'false' for B");
        boolean b = sc.nextBoolean();

        System.out.println("--- Variables A: " + a + " | B: " + b + " ---");


        if (!(a && b))
        {
            System.out.println("\n(Given) NOT (a AND b) evaluates to true");
        }
        else
        {
            System.out.println("\n(Given) NOT (a AND b) evaluates to false");
        }
        
        System.out.print("(Nested) NOT (a AND b) evaluates to: ");
        
        if (a) // If a is Ttru
        {
            if (b) // and b is true
            {
                System.out.println("false");
            }
            else // and b is false: a && b is FALSE, so !(a && b) is TRUE
            {
                System.out.println("true");
            }
        }
        else // If a is FALSE: a && b is FALSE, so !(a && b) is TRUE
        {
            System.out.println("true");
        }


        if (!(a || b))
        {
            System.out.println("\n(Given) NOT (a OR b) evaluates to true");
        }
        else
        {
            System.out.println("\n(Given) NOT (a OR b) evaluates to false");
        }

        System.out.print("(Nested) NOT (a OR b) evaluates to: ");

        if (a) 
        {
            System.out.println("false");
        }
        else 
        {
            if (b)
            {
                System.out.println("false");
            }
            else
            {
                System.out.println("true");
            }
        }
        
        sc.close();
    }
}