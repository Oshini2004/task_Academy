package Recursion;

public class power {
    static int fun(int p,int q){//p^q
        //base case
        if(q ==0) return 1;
        return fun(p,q-1)*p; //recursive work and self work
        //p^q-1*p=p^q
    }

    public static void main(String[] args) {
        System.out.println(fun(5,4));
    }
}
