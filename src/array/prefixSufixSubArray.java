package array;

import java.util.Scanner;

public class prefixSufixSubArray {
    static int findArraySum(int[]arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[]arr){
        int totalSum = findArraySum(arr);

        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int suffixSum = totalSum-prefSum;
            if(suffixSum==prefSum){
                 return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];

        System.out.println("enter" +n+ "element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("equal partition possible"+equalSumPartition(arr));
    }
}
