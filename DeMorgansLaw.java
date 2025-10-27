/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLaw
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'true' or 'false' for A");
        boolean a = sc.nextBoolean();

        System.out.println("Enter 'true' or 'false' for B");
        boolean b = sc.nextBoolean();

        System.out.println("--- De Morgan's Law 1 ---");

        if (!(a && b))
        {
            System.out.println("!(a && b): TRUE");
        }
        else
        {
            System.out.println("!(a && b): FALSE");
        }

        if (!a || !b)
        {
            System.out.println("(!a || !b): TRUE");
        }
        else
        {
            System.out.println("(!a || !b): FALSE");
        }


        System.out.println("--- De Morgan's Law 2 ---");

        if (!(a || b))
        {
            System.out.println("!(a || b): TRUE");
        }
        else
        {
            System.out.println("!(a || b): FALSE");
        }

        if (!a && !b)
        {
            System.out.println("(!a && !b): TRUE");
        }
        else
        {
            System.out.println("(!a && !b): FALSE");
        }

        sc.close();
    }

}
