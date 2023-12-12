import java.util.Scanner;

public class Temp3 {
    public static void main(String[] args) {

        int i,n;
        int sum=0;
        System.out.println("enter the no of term:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum +=i;
        }
        System.out.println("sum of n natural no.:"+" "+sum);
    }
}