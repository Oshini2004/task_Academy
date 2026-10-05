package array;

import java.util.Scanner;

public class SmallestUnsortedSubarray_wBestTimeComp_pt2 {

    public static int findsortedSubArray(int[]arr) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        //int l=0;
        int r = 0;
        boolean flag = false;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = true;
            }
            if (flag) {
                min = Math.min(min, arr[i]);
            }
        }
        flag = false;
        for (int i = n - 2; i > -0; i--) {
            if (arr[i] > arr[i + 1]) {
                flag = true;
                if (flag)
                    max = Math.max(max, arr[i]);
            }
            ///is k upr tk bs min max calculate kiya h///////

            ///now finding left value//
            for (int l = 0; l < n; l++) {
                if (min < arr[l])///min< current index
                    break;
            }
            for (r = n - 1; r >= 0; r--) {
                if (min > arr[r]) {
                    break;
                }

                //  return r-l<0?r-l+1 ;
            }

        }
        return arr[r];
    }


    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("enter array size");
            int n= sc.nextInt();

            int [] arr= new int [n];
            System.out.println("enter " +n+ " element");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        System.out.println(findsortedSubArray(arr));
    }

    }
////////////////NHI HO RHA///////////
/////////DIMMAG KA DAHI ZARUR HUA PR///////

