package array;

import java.util.Arrays;
import java.util.Scanner;
public class InsertIN_Array {
    public static void main(String[] args) {

        System.out.println("no.of element");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int [n+1];

        System.out.println(("enter array"));
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //insert
        System.out.println("enter position");
        int pos=sc.nextInt();
        System.out.println("enter value");
        int value= sc.nextInt();
        //shifting
        for(int i=n-1;i>=n;i--){
            arr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        //overwrite the element at pos
        arr[pos-1]=value;
        System.out.println(Arrays.toString(arr));
    }

}
