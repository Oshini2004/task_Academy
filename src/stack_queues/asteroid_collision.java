package stack_queues;

import java.util.Stack;

public class asteroid_collision {
    public static int[] collision(int[]arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            //if stack is empty or +ve value arrives the
            if (stack.isEmpty() || arr[i] >= 0) {
                stack.push(arr[i]);
            } else {
                while (!stack.isEmpty()) {
                    int top = stack.peek();
                    if (top < 0) {
                        stack.push(arr[i]);
                        break;
                    }
                    int modVal = Math.abs(arr[i]);
                    if (modVal == top) {
                        stack.pop();
                        break;
                    } else if (modVal < top) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(arr[i]);
                            break;
                        }
                    }
                }
            }
        }
        //return stack.size();

                int len=stack.size();
                int ansArray[]=new int [len];
                for(int i=len-1;i>=0;i--){
                    ansArray[i]=stack.pop();
                }
  return ansArray;

    }

    public static void main(String[] args) {
        int []arr={5,10,-5};
      //  int[] result =collision(arr);
        collision(arr);
        System.out.println(collision(arr));
     //   System.out.println("2nd " +result);
    }
}
