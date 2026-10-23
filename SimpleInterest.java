import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter principle");
        float p=sc.nextFloat();
        System.out.println("Principle"+p);

        System.out.println("Enter rate of interest");
        float r=sc.nextFloat();
        System.out.println("Rate of interest"+r);

        System.out.println("Enter time");
        float t=sc.nextFloat();
        System.out.println("Time"+t);

        float si=(p*r*t)/100;

        System.out.println("Simple Interest"+si);



    }
}