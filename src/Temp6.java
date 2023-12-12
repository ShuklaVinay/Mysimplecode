import java.util.Scanner;
public class Temp6
{
    public int factNumber(int n)
    {
        if (n==0)
        {
            return 1;
        }
        return n*factNumber(n-1);
    }


    public static void main(String[] args)
    {
     int n;
        System.out.println("please enter the number for factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //int result= factNumber(n);
        Temp6 f1=new Temp6();
       int result= f1.factNumber(n);
        System.out.println("Factorial of the given number is :"+" "+result);
    }
}
