import java.util.Scanner;
public class AscendingSortArray {
    public static int[] arraySort(int[] num)
    {
        for(int i=0;i< num.length;i++)
        {
            for (int j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
            //System.out.print(num[i]+" ");
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        int []num=new int[size];
        System.out.println("enter array value for sorting");
        for (int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        int[] sort=arraySort(num);
        System.out.print("Array after sorting in ascending order:");
        for (int i=0;i< sort.length;i++)
        {
            System.out.print(sort[i]+" ");
        }

    }
}
