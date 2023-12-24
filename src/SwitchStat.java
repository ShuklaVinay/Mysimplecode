//Calculator
import java.util.Scanner;
public class SwitchStat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1- +\n2- -\n3- *\n4- /\n5- %");
        System.out.println("choose any number for perform  operation:");
        int operator=sc.nextInt();
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        switch (operator)
        {
            case 1:
                c=a+b;
                System.out.println(c);
                break;
            case 2:
                if(a>=b)
                    c=a-b;
                else
                    c=b-a;
                System.out.println(c);
                break;
            case 3:
                c=a*b;
                System.out.println(c);
                break;
            case 4:
                c=a/b;
                System.out.println(c);
                break;

            case 5:
                c=a%b;
                System.out.println(c);
                break;
            default:
                System.out.println("invalid number");


        }
    }
}
