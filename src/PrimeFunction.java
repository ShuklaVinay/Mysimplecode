//Make a function to check if a number is prime or not.

import java.util.Scanner;
public class PrimeFunction {
    public static void CheckPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("prime no.");
        }
        else {
            System.out.println("not prime");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to check prime or not");
        int n=sc.nextInt();
        PrimeFunction.CheckPrime(n);
    }

}
