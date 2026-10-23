import java.util.Scanner;

public interface checkPrime {
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n-1;i++){
            //stop the function as you get the first divisor
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //creating unother function for same but with better approch
    public static void primeprime (int A,int B){
        for(int i=A;i<B;i++){
            if(isPrime(i)){
            System.out.println(i+"  ");
        }
    }
}
public static int sumDivisors(int n){
    int sum =0;
    for(int i=1;i*i<=n;i++){
        if(n%i==0){
            if(i*i==n){
                sum=sum +i;
            }
            else{
                //square root of n
                sum= sum +i +n/i;
            }
        }
    }
    return sum;
}


    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(sumDivisors( n));
        int A= sc.nextInt();
        int B =sc.nextInt();
        primeprime(A, B);
    }
        

        // System.out.println("enter thr num");
        // Scanner sc =new Scanner(System.in);
        // int n=sc.nextInt();
        // if(isPrime(n)){
        //     System.out.println("yes it is prime");
        // }
        // else{
        //     System.out.println("it is not prime");
        // }
    }



       
    

