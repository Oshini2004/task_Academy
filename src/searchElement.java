import java.util.Arrays;
import java.util.Scanner;

public class searchElement {
    public static int[] searchAll(int[] arr,int E){
        int count=0;
        for(int x:arr){
            if(x==E){
                count++;
            }
        }
        //create a new array of size == count
        int[] output= new int[count];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==E){
                output[j]=i;
                j++;
            }
        }
        return output;
    }
    public static int[] searchAll2(int[]arr,int element){
        int n=arr.length;
        int[] output=new int[n+1];
        int j=0;//output

        for(int i=0;i<n;i++){
            if(arr[i]==element){
                output[j]=i;
                j++;
            }
        }
        //terminatinng the output with -1
        output[j]=-1;
        return output;
    }


    public static void main(String[] args) {
        int[] arr={5,6,7,2,7,3,7,4};
        int[] output=searchAll2(arr,7);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(output));

        output =searchAll2(arr,7);

    }
}
////NOT WORKING///
