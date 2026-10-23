import java.util.ArrayList;
import java.util.Arrays;

public class OOPBitWiseXORdemo {
    public static int solve(ArrayList<Integer>a){
        int res =0;
        for(int x:a){
            res=res^x;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(5^7);
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,5,7,1,8,7,5));
        System.out.println(solve(arr)); 
    }
    
}
