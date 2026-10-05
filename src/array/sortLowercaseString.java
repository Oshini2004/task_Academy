package array;

import java.util.Arrays;

public class sortLowercaseString {
    public static void sortLower(char[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]>='a'&& arr[i]<='z'){
                Arrays.sort(arr);
            }
        }
    }

    public static void main(String[] args) {
        char[]arr={'b','a','t','m','a','n'};
        sortLower(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
