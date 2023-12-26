//Taking an array as an input and printing its elements.
import java.util.Scanner;
public class NumberArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int []num=new int[size];
        System.out.println("enter element of an array:");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("enter value of x and search in an array");
        int x=sc.nextInt();
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==x)
            {
                System.out.println("value of x is in array index no.:"+i);
            }
        }
        System.out.println("display an entered array");
        for (int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }

    }
}
