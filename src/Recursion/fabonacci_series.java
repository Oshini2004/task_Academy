package Recursion;

public class fabonacci_series {
    static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
//        //subprob= self work
//        int prev =fib(n-1);
//        int prevprev=fib(n-2);
//
//        //self work
//        return prev+prevprev;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fib(i));
        }
    }

}
