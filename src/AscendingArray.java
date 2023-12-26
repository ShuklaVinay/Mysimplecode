//Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.Scanner;
public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int size=sc.nextInt();
        int[] num=new int[size];
        System.out.println("enter an array elements for array is ascending order");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]>num[i+1])
            {
                isAscending=false;
            }
        }
        if(isAscending)
        {
            System.out.println("Array is sorted in Ascending order");
        }
        else {
            System.out.println("array is not sorted in ascending order");
        }
    }
}
