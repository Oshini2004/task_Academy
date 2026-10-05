package hashing;

import java.util.HashSet;

public class tripletSum {
    public static boolean hastripletWithSum(int []arr,int S){
        int n= arr.length;
        //findind first element
        for(int i=0;i<n-2;i++){
            int target =S-arr[i];
            HashSet<Integer>set=new HashSet<>();

            //checking pairs in rest of the array
            for(int j=i+1;j<n;j++){
                int complement =target-arr[j];

                if(set.contains(complement)){
                    System.out.println("triplet sum found "+arr[i] + " ," +arr[j]+ "  ," +complement);
                    return true;
                }
                set.add(arr[j]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr={1,3,5,7,10,12,15};
        int S=25;
        if(hastripletWithSum(arr,S)){
            System.out.println("above triplets are found ");
        }
        else {
            System.out.println("no trplets found ");
        }
    }

}
