//by using recursion

import java.util.Scanner;

public class Temp4
{
    public static void printNum(int n)
{
    if(n==0)
    {
        return;
    }
    System.out.println(n);
    printNum(n-1);
}
    public static void main(String[] args) {
        int n;
        System.out.println("enter the no of term");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        printNum(n);

    }
}
