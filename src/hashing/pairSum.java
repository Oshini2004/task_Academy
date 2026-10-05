package hashing;
import java.util.HashSet;
public class pairSum {
    public static boolean hashPairwithSum(int []arr,int k){
        HashSet<Integer>set=new HashSet<>();

        for(int num: arr){
            int complement = k-num;
            if(set.contains(complement)) {
                System.out.println("pair found :  " + num + " , " + complement + " ");
                return true;///i!=j is guranteed
            }
            set.add(num);
            }
        return false;
        }

    public static void main(String[] args) {
        int [] arr={2,7,11,15,7};
        int k =14;

        if(!hashPairwithSum(arr,k)){
            System.out.println("no such pair exists");
    }
    }
}
