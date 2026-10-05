package Scaler;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        //1 insertion later
        int[] arr= new int[n];

        //read the array(n) element
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }
        //print
        System.out.println(Arrays.toString(arr));
        //insertion
       int pos =sc.nextInt();
       for(int i=0;i<=arr.length;i++){
           if(arr[i]==arr[pos]){

           }
           return;
       }
//       // int y =sc.nextInt();
//        //shifting
//        for(int i=n;i<=arr.length;i++) {
//            if (arr[pos] == arr[i]) {
//                for (int j = i; j <= n; j++) {
//                    arr[j]=arr[j+1];
//
//                }
//                break;
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        //overwrite the element at pos
        //arr[pos-1]=y;
        //print
        //System.out.println(Arrays.toString(arr));


    }
}




