//Print all even numbers till n.

import java.util.Scanner;
public class EvenN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("even no of nth term:");
        /* by using for loop
        for(int i=1;i<=n;i++)
        {
            if (i%2 == 0)
                System.out.println(i);
        } */
        //by using while loop
       /* int i=1;
        while(i<=n)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
            i++;
        } */
        //by using do while loop
        int i=1;
        do {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }while (i<=n);
    }
}
