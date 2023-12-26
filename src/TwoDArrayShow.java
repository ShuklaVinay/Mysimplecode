//2D array elements show in matrix form

import java.util.Scanner;
public class TwoDArrayShow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of 2D Array form of row and column:");
        int m=sc.nextInt(); //for row size
        int n=sc.nextInt(); //for column size
        int[][] number=new int[m][n];
        System.out.println("enter element in 2D array"+" "+"row="+m +","+"column="+n);
        //loops for input elements in 2D Array
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                number[i][j]=sc.nextInt();
            }
            //System.out.println();
        }
        System.out.println("print 2D array in matrix form");
        for (int i=0;i<number.length;i++)
        {
            for(int j=0;j<number.length;j++)
            {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
