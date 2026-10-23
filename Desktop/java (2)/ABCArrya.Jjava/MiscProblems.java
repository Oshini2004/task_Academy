public class MiscProblems {

    static void SwapWithouTemp(int a,int b){

    }
    //a=9,b=3
    static void swap(int a,int b){
        System.out.println("original value before swap");
        System.out.println("a"+a);
        System.out.println("b"+b);

        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("values after swap");
        System.out.println("a"+a);
        System.out.println("b"+b);
        //a=3,b=9
    }
    public static void main(String[] args){
        int a =9;
        int b =3;
        int[] arr= {1,2,3,4,5};

        SwapWithouTemp(a, b);
    }
    
}
