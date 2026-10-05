package array;

public class magicNo {
   public static int nthMagic(int n){
       int ans=0;
       int power=5;
       while(n>0){
           int last_bit = n&1;
               ans += last_bit*power ;

              power*=5;
               n>>=1;
           }
       return ans;
       }

    public static void main(String[] args) {
        int n=6;
        int result =nthMagic(n);
        System.out.println(n+ " th magic no. is " +result);
    }

}
