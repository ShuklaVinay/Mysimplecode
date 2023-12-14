import java.util.Scanner;
public class FabonnaciExm
{
    public static void fibNum(int a,int b,int n)
   {
           if(n==0)
           {
               return;
           }
       int c=a+b;
       System.out.println(c);
       fibNum(b,c,n-1);
   }
    public static void main(String[] args)
       {
        int n;
        int a=0,b=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter no of term :");
        n=sc.nextInt();
           System.out.println(a);
           System.out.println(b);
        fibNum(a,b,n-2);
    }
}
