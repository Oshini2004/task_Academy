package stack_queues;

public class countTheReversals_optimizeInSize {
    public static int countrev(String s){
        int ans=0;
        int close=0;
        int open =0;
        if(s.length()%2!=0){
            return -1;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'){
                open ++;
            }else{
                if(open<=0){
                    close++;
                }else{
                    open--;

                }
            }
        }
        ans=(int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
        return ans;
    }

    public static void main(String[] args) {
        String s= "}{{}}{{{";
        int result =countrev(s);
        System.out.println(result);
    }
}
