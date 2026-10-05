package stack_queues;

import java.util.Stack;

class  Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public  class stack {
    Node head;

    stack(){
        head =null;
    }
    void puch(int d){
        //insert at head
        if(head==null){
            head=new Node(d);
        }
        else{
            Node n = new Node(d);
            n.next=head;
            head=n;
        }
    }
    void pop(){
        //remove at head
        if(head!=null){
            head=head.next;
        }
    }
    int top(){
        //sea the head
        return head.data;
    }
    boolean empty(){
        return head==null;
  }

//    public static void main(String[] args) {
//    stack s=new stack();
////
//        s.puch(1);
//        s.puch(2);
//       s.puch(3);
//        s.pop();
//        s.puch(4);
        //see all element
       // while(!s.epmty()){
//            int x = s.top();
//            System.out.println(x);
//            s.pop();
//        }



    }




