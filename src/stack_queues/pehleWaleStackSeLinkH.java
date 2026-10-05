package stack_queues;

import java.util.Stack;

public class pehleWaleStackSeLinkH {
    public static void main(String[] args) {
        Stack s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);
        //see all element
        while(!s.empty()){
      //    int x= s.top();
        //    System.out.println(x);
            s.pop();
        }

    }
}
