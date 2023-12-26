//Make a function to print the table of a given number n.
import java.util.Scanner;
public class TableFun {
public static void tableFun(int n){
    //int c=1;
    for(int i=1;i<=10;i++)
    {
        int c=n*i;
        System.out.print(c+" ");
    }

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no for table:");
        int n=sc.nextInt();
        tableFun(n);
    }
}
