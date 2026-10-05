package stack_queues;

import java.util.ArrayList;
import java.util.Stack;

public class onlineStockSpan {

      Stack<Integer> stack = new Stack<>();
      ArrayList<Integer> list = new ArrayList<>();


    public int next(int price) {
       // Stack<Integer> stack = new Stack<>();
       //   ArrayList<Integer> list = new ArrayList<>();
        list.add(price);
        // idx is store in stack , index=stack.peek()
        //list.get(index)->value
        while (!stack.isEmpty() && list.get(stack.peek())<=price){
            stack.pop();
        }
        //lowerlimit
        int prevGreaterIndex=(stack.isEmpty())?-1:stack.peek();
        int currIdx = list.size()-1;
        int ans =currIdx-prevGreaterIndex;

        stack.push(currIdx);
        return ans;
    }

    public static void main(String[] args) {
        onlineStockSpan obj = new onlineStockSpan();

        System.out.println(obj.next(100)); // Output: 1
        System.out.println(obj.next(80));  // Output: 1
        System.out.println(obj.next(60));  // Output: 1
        System.out.println(obj.next(70));  // Output: 2
        System.out.println(obj.next(60));  // Output: 1
        System.out.println(obj.next(75));  // Output: 4
        System.out.println(obj.next(85));  // Output: 6

    }
}