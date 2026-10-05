package array_2Darray.java;

import java.util.Scanner;

public class printSpiral {
    public static void printMatrix (int[][]matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println( );
        }
    }
    static void printspiralorde (int[][]matrix ,int r, int c){
        int topRow=0, bottomRow=r-1, leftcol=0, rightmcol=c-1;
        int totalElement =0;

        while(totalElement< r*c){                    //j represent column & i represent row
            //topRow=leftcol to rightcol
            for(int j=leftcol;j<=rightmcol && totalElement < r*c ;j++){
                System.out.print(matrix[topRow][j]+ " ");
                totalElement++;
            }
            topRow++;

            //rightcol=toprow to bottomrow
            for(int i=topRow;i<=bottomRow&& totalElement<r*c;i++){
                System.out.print(matrix [i][rightmcol]+" ");
                totalElement++;
            }
            rightmcol--;

            //bottomrow=rightcol to leftcol
            for(int j=rightmcol;j>=leftcol && totalElement<r*c; j--){
                System.out.print(matrix[bottomRow][j]+ " ");
                totalElement++;
            }
            bottomRow--;

            //leftcol = bottomrow to toprow
            for(int i=bottomRow;i>=topRow && totalElement<r*c; i--){
                System.out.print(matrix[i][leftcol]+ " ");
                totalElement++;
            }
            leftcol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows & column in matrix");

        int r= sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix= new int [r][c];

        int total=r*c;
        System.out.println("enter " +total+ " values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);

        System.out.println("spiral order");
        printspiralorde(matrix,r,c);
    }
}
