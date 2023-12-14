import java.util.Scanner;

public class FibboForL
{
    public static void main(String[] args) {
        int a=0,b=1,c,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no. of terms for Fibonacci series :");
        n=sc.nextInt();
        System.out.println("you entered no of term "+" "+n);
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
