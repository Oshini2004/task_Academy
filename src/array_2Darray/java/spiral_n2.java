package array_2Darray.java;

import java.util.Scanner;

public class spiral_n2 {
    public static int printMatrix (int[][]matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println( );
        }
       return 1;
    }

    static int[][] generateSpiralMatrix (int n){
        int[][] matrix =new int [n][n];

        int topRow=0, bottomRow=n-1, leftcol=0, rightmcol=n-1;
        int curr =1;

        while(curr<= n*n){                    //j represent column & i represent row
            //topRow=leftcol to rightcol
            for(int j=leftcol;j<=rightmcol && curr <= n*n ;j++){
                matrix[topRow][j]=curr++;
            }
            topRow++;

            //rightcol=toprow to bottomrow
            for(int i=topRow;i<=bottomRow&& curr<=n*n;i++){
                matrix [i][rightmcol]=curr++;
            }
            rightmcol--;

            //bottomrow=rightcol to leftcol
            for(int j=rightmcol;j>=leftcol && curr<=n*n; j--){
                matrix[bottomRow][j]=curr++;
            }
            bottomRow--;

            //leftcol = bottomrow to toprow
            for(int i=bottomRow;i>=topRow && curr<=n*n; i--){
                matrix[i][leftcol]=curr++;
            }
            leftcol++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        int [][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);

//        int [] [] result=generateSpiralMatrix(n);
//        System.out.println(result);

    }
}
