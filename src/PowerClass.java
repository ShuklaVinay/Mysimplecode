import java.util.Scanner;
public class PowerClass
{
    public static int powerCal(int x,int n)
    {
        if (n==0)
        {
            return 1;
        }
        if (x==0)
        {
            return 0;
        }
        return x*powerCal(x,n-1);
    }
    public static void main(String[] args)
    {
        int x,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x :");
        x=sc.nextInt();
        System.out.println("please enter the value of n");
        n=sc.nextInt();
        int result=powerCal(x,n);
        System.out.println("the result of x^n :"+" "+result);
    }
}
