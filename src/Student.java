import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks,input;

        do {
            System.out.println("enter student marks:");
            marks=sc.nextInt();
            if(marks>=90 && marks<=100)
            {
                System.out.println("this is good");
            } else if (marks<=89 && marks>=60) {
                System.out.println("this is also good");
            } else if (marks<=59 && marks>=0) {
                System.out.println("this is good as well");
            }
            else {
                System.out.println("invalid number:");
            }
            System.out.println("want to continue ? (yes(1) or no(0))");
            input=sc.nextInt();
        }while(input==1);

    }
}
