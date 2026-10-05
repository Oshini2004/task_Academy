package stack_queues;

import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n) {

        Stack<Long> stack = new Stack<>();
        n = arr.length;
        long result[]=new long[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
               stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long arr[]={2,1,7,11,12,3,6,9};
       long[] res=  nextLargerElement(arr, arr.length);
        System.out.println(Arrays.toString(res));

    }
}