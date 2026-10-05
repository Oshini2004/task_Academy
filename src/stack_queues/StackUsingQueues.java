package stack_queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void puch(int val) {
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        queue1.offer(val);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }

    public  int peek() {
        if (queue1.isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return queue1.peek();
    }

    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return queue1.poll();
    }


public static void main(String[] args) {
        StackUsingQueues stack =new StackUsingQueues();
        stack.puch(10);
        stack.peek();
        stack.puch(20);
        stack.puch(30);
        stack.puch(40);
        stack.peek();
        stack.peek();
        stack.pop();
        stack.peek();

}

}
