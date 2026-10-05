package array;

import java.util.Scanner;

public class SortedArray {
    public static boolean isSorded(int[]arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            if(arr[i]>arr[i+1]){
                return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array is"+isSorded(arr));
    }

}
