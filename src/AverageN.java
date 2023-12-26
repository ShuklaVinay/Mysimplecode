//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;
public class AverageN {
    public static void averageFun(int a,int b,int c){
        int d=(a+b+c)/3;
        System.out.println("average of 3 no.="+d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 no. for user :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        averageFun(a,b,c);
    }
}
