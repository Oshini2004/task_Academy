package stack_queues;

import java.util.Stack;
import java.util.Arrays;

public class LargestRecInHistogram {
    public static int LargestArea(int []arr){
        Stack<Integer>stack=new Stack<>();
        int n= arr.length;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int element =(i==n)?0: arr[i];
            while(!stack.isEmpty()&& arr[stack.peek()]>element){
                int h =arr[stack.pop()];
                int left =(stack.isEmpty())?-1:stack.peek();
                int width =i-left-1;
                max=Math.max(max,h*width);
            }
            stack.push(i);
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }

    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};
        int result= LargestArea(arr);
        System.out.println(result);
    }
}
