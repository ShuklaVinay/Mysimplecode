//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;
public class GreatestTwoNo {
public static int greatestNum(int a,int b){
    if(a>b)
    {
        return a;
    }
    else {
        return b;
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("greatest of between two numbers:"+" "+greatestNum(a,b));
    }
}
