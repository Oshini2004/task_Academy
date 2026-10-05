package oopsCoderArmy;

public class Demo1 {
    public static void main(String[] args) {
        int n=7;
        boolean isPrime =true;

        if(n<1){
            isPrime=false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime" );
        }
    }
}
///7%2=1
//7%3=1
//7%4=3
