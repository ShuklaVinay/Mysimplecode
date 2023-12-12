import java.util.Scanner;
public class AddTwoNo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please inter first no:");
        int a=sc.nextInt();
        System.out.println("Please inter second no:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("sum of two integer no entered by user is :"+" "+c);
    }
}
