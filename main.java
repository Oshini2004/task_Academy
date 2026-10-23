import java.util.Scanner;

class Algebra{

    int a;
    int b;

    Algebra(int x, int y) {
        System.out.println("constructor of algenra class ");
        a= x;
        b= y;


     }
    int add( ){
        int ans = a+b;
        return ans;

    }
    int sub(){
        return a - b;
    }
    int mul(){
        return a*b;
    }
    
}

public class main {
    public static void main(String[] args) {
        
        Algebra obj = new Algebra(5,7);
        Scanner  sc = new Scanner(System.in);
        // int x= sc.nextInt();
        // int y = sc.nextInt();

        System.out.println("sum of input no. is");
        int  ans = obj.add();
        System.out.println(ans);

        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra obj2 = new Algebra( 10, 7);
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());





        

    }

} 
