//2^n 2ke power n program by recursive

import java.util.Scanner;
public class Temp7
{
    int power(int n)
    {
        if (n==0)
        {
            return 1;
        }
        return 2*power(n-1);
    }


    public static void main(String[] args)
    {
     int n;
        System.out.println("please enter power number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Temp7 p1=new Temp7();
        int result= p1.power(n);
        System.out.println("value of 2ke power n:"+" "+result);
    }
}
