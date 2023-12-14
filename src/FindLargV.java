//by using if else statement without creating any method
import java.util.Scanner;

public class FindLargV
{
    public static void main(String[] args)
    {
       int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first no.");
        a=sc.nextInt();
        System.out.println("Please enter second no.");
        b=sc.nextInt();
        System.out.println("Please enter third no.");
        c=sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println("a is the largest no."+" "+a);
        } else if (b>a && b>c)
        {
            System.out.println("b is the largest no."+" "+b);
        }
        else
        {
            System.out.println("c is the largest no."+" "+c);
        }

    }
}
