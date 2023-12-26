import java.util.Scanner;

//Addition of 2D array
public class AddTwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            //to create first 2D array
            System.out.println("enter the same size row and column for first 2D array:");
            int m = sc.nextInt(); //size of row first 2D array
            int n = sc.nextInt(); //size of column first 2D array
            int[][] mat1 = new int[m][n];
            if(m ==n)
            {
            //input in first 2D array
            System.out.println("enter element in first 2D array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            //print first 2D array
            System.out.println("first 2D array is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }

            //to create second 2D array
            System.out.println("enter the same size row and column for second 2D array:");
            m = sc.nextInt();
            n = sc.nextInt();
            int[][] mat2 = new int[m][n];
            //input in second input array
            System.out.println("enter element in second 2D array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            System.out.println("second 2D array is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }

                int[][] matSum = new int[m][n];
                //adding two matrix
                System.out.println("addition of 2D array");
                for (int i = 0; i < m; i++) {
                    int j;
                    for (j = 0; j < n; j++) {
                        matSum[i][j] = mat1[i][j] + mat2[i][j];
                        System.out.print(matSum[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("create 2D array with same size of rows & columns");

            }
            System.out.println("want to continue ? (Yes(1) or No(0))");
            input = sc.nextInt();

        } while (input == 1);
    }
}