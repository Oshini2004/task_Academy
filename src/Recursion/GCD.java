package Recursion;

import java.util.Scanner;

public class GCD {
    static int Gcd(int x,int y){
        while (x%y!=0){
            int reminder =x%y;
            x=y;
            y=reminder;
        }
        return y;
    }
    static int GCD_byEuclidsAlgo(int x,int y){
        if(y==0){
            return x;
        }
        return GCD_byEuclidsAlgo(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        System.out.println(Gcd(x,y));
        System.out.println("by euclids algo");
        System.out.println(GCD_byEuclidsAlgo(x,y));
    }
}
