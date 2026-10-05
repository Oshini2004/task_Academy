package stack_queues;

public class stackbasics {
    int stack[];
    int top;
    int size;

    public stackbasics(int stackSize){//here we created constructor
        stack =new int[stackSize];
        size=stackSize;
        top=-1;
    }
    public void puch(int element){
        if(top>=size-1){
            System.out.println("stack is full:overflow");
            return ;
        }
        top++;
        stack[top]=element;
    }
    public boolean isEmpty(){
        return top>=-1;
    }
    public int size(){
        return top+1;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }
    public int pop(){
        int val=peek();
        if(val!=Integer.MIN_VALUE){
            top--;
        }
        return val;
    }
    public void printStack(){
        System.out.println("printing stack");
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]);
            if(i!=top){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=5;//user input
        stackbasics stack =new stackbasics(n);
        System.out.println("isEmpty" + stack.isEmpty());
        stack.puch(9);
        stack.printStack();
        stack.puch(1);
        stack.printStack();
        stack.puch(8);
        stack.printStack();
        stack.puch(5);
        stack.printStack();
        stack.puch(8);
        stack.printStack();
        stack.puch(2);
        stack.printStack();
        stack.puch(6);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("size"+stack.size());
        System.out.println("isEmpty"+stack.isEmpty());
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("peek" + stack.peek());
    }
}


