package stack_queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public  class QueueUsingStack {
    Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();

    public void enqueue(int val) {
        //move all elements from stack 1 to stack 2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        //insert value in stack 1
        stack1.push(val);
        //move all elements from stack 2 to stack 1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    public int dequeue() { //1 ke elements 2 m dal rhe hai..
        if (stack1.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return stack1.pop();
    }
//        while (!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        int val = stack2.pop();
//        while (!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        return val;
//        }
    public int peek(){ //1 ke elements 2 m dal rhe hai
        if(stack1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stack1.peek();
//        while (!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        int val = stack2.peek();
//        while (!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        return val;
    }

    public static void main(String[] args) {
      //  Queue<Integer>queue=new LinkedList<>();
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("peek is "+queue.peek());
        System.out.println("dequeue is "+queue.dequeue()); //pop
        queue.enqueue(7);
        System.out.println("peek is " +queue.peek());
    }
}
