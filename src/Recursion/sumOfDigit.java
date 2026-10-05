package Recursion;

public class sumOfDigit {
    static int SumofDig(int n){
        //base casee
        if(n>=0 && n<=9) {
            return n;
        }//recursive work
        return SumofDig(n/10)+n%10;//self work
        }

    public static void main(String[] args) {
        System.out.println(SumofDig(1234));
    }
    }

