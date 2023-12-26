//Write a program to print Fibonacci series of n terms where n is input

import java.util.Scanner;
public class FibonacciFun {
    public static void fibonnaciSeries(int n) {

        int a = 0, b = 1,c;

        System.out.println(a+" \n"+b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(c+" ");
                a=b;
                b=c;
        }
        //System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        fibonnaciSeries(n);
    }
}
