import java.util.Scanner;
public class Temp2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two integer no.");
        int a=sc.nextInt();
        int b=sc.nextInt();


        if (a>b)
        {
            System.out.println(a+" "+ "is a largest no.between two integer");
        } else if (b>a) {
            System.out.println(b+" "+ "is the largest no." );
        }
        else {
            System.out.println(a+" "+"and" + " "+b+" "+"both are the same");

        }
    }
}
