package array;

import java.util.Scanner;

public class subArray {

   public static int largestNum(int []arr){
  // public static void main(String[] args) {

        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<=n-1;j++){

                int sum=0;
                for(int k=1;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum>largest){
                    largest=sum;
                }
            }
        }
return largest;
    }

    public static void main(String[] args) {
        System.out.println("array size");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];

        System.out.println("enter" +n+ "element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largestNum(arr));
    }



}
