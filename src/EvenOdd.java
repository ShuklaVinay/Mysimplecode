//Make a function to check if a given number n is even or not.

import java.util.Scanner;
public class EvenOdd {
    public static void checkEvenOdd(int n){
        if(n%2 ==0)
        {
            System.out.println("no is even");
        }
        else {
            System.out.println("no. is odd");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to check even or odd");
        int n=sc.nextInt();
        checkEvenOdd(n);
    }
}
