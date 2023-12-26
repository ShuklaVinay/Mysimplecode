//Take an array of names as input from the user and print them on the screen
import java.util.Scanner;
public class ArrayString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int size=sc.nextInt();
        String[] name=new String[size];
        System.out.println("enter array elements as string type name:");
        for(int i=0;i<size;i++)
        {
            name[i]=sc.next();
        }
        System.out.println("enter name for search");
        String str=sc.next();
        //System.out.println("entered array is:");
        for(int i=0;i<name.length;i++)
        {
            if(name[i].equals(str))
            {
                System.out.println("name search index no is:"+i);
            }
            //System.out.println(name[i]);

        }

    }
}
