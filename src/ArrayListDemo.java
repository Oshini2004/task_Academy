//import java.util.ArrayList;
public class ArrayListDemo {

    public static int pesaDouble(int pesa){
        pesa =2*pesa;
        System.out.println("pesa double" +pesa);
        return pesa;
    }
    public static void main(String[] args){
        int money=100;
        money=pesaDouble(money);
        System.out.println("main" +money);
    }

}
