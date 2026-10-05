package Recursion;

public class party {
    public static int countWay(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int solo=countWay(n-1);
        int pair=(n-1)+countWay(n-2);
        return solo+ pair;
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println("no. of ways to go party "+countWay(n));
    }
}
