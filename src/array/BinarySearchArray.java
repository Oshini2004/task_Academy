package array;

import java.util.Scanner;

public class BinarySearchArray {

    public static int BinarySearch(int[] arr,int key){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>key){
                end=mid-1;
            } else if (arr[mid]==key) {
                return mid;
            }
            else {
                start = mid + 1;
            }
            }
        System.out.println("not present");
        return -1;
        }

    public static void main(String[] args) {

        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter " +n+ " element" );
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
        System.out.println("enter x ");
        int x = sc.nextInt();

    }
}
/////////////////////////NHI HO RHA RUN KARNE M PROB. HAI//////////////////////