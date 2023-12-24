import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no for check prime or not:");
        int n=sc.nextInt();
        //int counter=0;
        boolean isPrime=true;
        for(int i=2;i<=n;i++)
        {
            if(n%i == 0)
                //counter++;
                isPrime=false;
            break;

        }
       /* if(counter==2){
            System.out.println("no is prime ");
        }else {
            System.out.println("not prime");
        }*/

        if(isPrime){
            System.out.println("no is prime ");
        }else {
            System.out.println("not prime");
        }
    }
}
