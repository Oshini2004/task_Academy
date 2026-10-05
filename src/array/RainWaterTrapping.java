package array;

import java.util.Scanner;

public class RainWaterTrapping {
   // public static int maxwater(int[] arrHeight){
   public static void main(String[] args){
   int[]arrHeight  ={2, 1, 5, 3, 1, 0, 4};
        int n=arrHeight.length;

        int[]maxLeft= new int[n];
        int[]maxRight= new int [n];

        maxLeft[0]=arrHeight[0];
        maxRight[n-1]=arrHeight[n-1];

        for(int i=1; i<n;i++){
            maxLeft[i]=Math.max(maxLeft[i-1],arrHeight[i]);
        }
        for(int i=n-2;i>=0;--i){
            maxRight[i]=Math.max(maxRight[i+1],arrHeight[i]);
        }
        int totalWater =0;

        for(int i=1;i<n-1;i++){
            totalWater+=Math.min(maxLeft[i],maxRight[i])-arrHeight[i];
        }
        //return totalWater;
       System.out.println(totalWater);
    }


//public static void main(String[] args) {
 //   int[] arr = {2, 1, 5, 3, 1, 0, 4};
  //  System.out.println(maxwater(arrHeight)); // prints 9

}


//public static void main(String[] args) {
//    int[] aar={0,1,0,2,1,0,1,3,2,1,2,1};
//    int result= trap(arr);
//    System.out.println(trap);

