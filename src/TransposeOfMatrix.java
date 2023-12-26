//transpose of matrix
import java.util.Scanner;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in;
        do {
            System.out.println("enter the siz of row and column:");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] matrix = new int[m][n];

            System.out.println("enter the value in 2D array;");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            if (m == n) {

                System.out.println("Transpose of the matrix:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {

                        System.out.print(matrix[j][i] + " ");


                    }
                    System.out.println();
                }
            } else {
                System.out.println("create 2D array with same row and column size.");
            }
            System.out.println("want to continue ? (Yes(1) or No(0))");
            in=sc.nextInt();
        }while (in==1);
            }

        }


