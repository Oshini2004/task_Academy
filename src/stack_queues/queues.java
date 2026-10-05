package stack_queues;

public class queues {
    int arr[];
    int front;
    int rear;
    int cs;
    int N;//maxSize

    queues(int defaultsize){
        N =defaultsize;
        arr=new int[N];
        front=0;
        rear=0;
    }
    void puch(int x) {
        //if q is not full
        if (!full()) {
            arr[rear] = x;
            rear = (rear + 1) % N;
            cs++;
        }
    }
    void pop() {
        if (!empty()) {
            //if q is not empty
            front = (front + 1) % N;
            cs--;
        }
    }
    int getFirst(){
        if(!empty()){
            return arr[front];
        }
        else {
            System.out.println("error: queue is empty");
            return -1;
        }
    }
    boolean empty(){
        return cs==0;
    }
    boolean full(){
        return cs ==N;
    }
}
