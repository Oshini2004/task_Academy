package stack_queues;

import java.util.Stack;

public class countTheReversals {
  public static int counRev (String s){
        if(s.length()%2!=0){
            return -1;
        }

        Stack<Character>stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()||stack.peek()=='}'){
                    stack.push(ch);
                }else{
                    //pop in case of valid pair{}
                     stack.pop();
                }
            }
        }
        int ans=0;
        int close=0;
        int open =0;
        while (!stack.isEmpty()){
            char top =stack.pop();
            if(top=='{'){
                open ++;
            }else{
                close++;
            }
        }
        ans=(int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
        return ans;
    }

    public static void main(String[] args) {
        String s="}{{}}{{{";
        int result =counRev(s);
        System.out.println(result);
    }
}
