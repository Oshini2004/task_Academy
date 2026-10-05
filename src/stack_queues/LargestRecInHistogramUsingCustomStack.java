package stack_queues;
import java.util.Arrays;

public class LargestRecInHistogramUsingCustomStack {
    public static int LargestArea(int []arr){
        int n = arr.length;
        int stack[]=new int [n+1];
        int idx =-1;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int element =(i==n)?0:arr[i];
            while(idx!=-1 && arr[stack[idx]]>element ){
                int h= arr[stack[idx]];
                int prevSmallest=(idx==-1)?-1:stack[idx];
                int w =i-prevSmallest-1;
                max=Math.max(max,h*w);
            }
            stack[++idx]=i;
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};

        int result= LargestArea(arr);
       System.out.println(result);
    }

}
