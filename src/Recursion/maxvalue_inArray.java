package Recursion;

public class maxvalue_inArray {
    static void printArray(int[ ]arr,int idx){
        //base case
        if(idx==arr.length-1){
            return;
        }

        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxValue=Math.max(arr[i],maxValue);
        }
        System.out.println(maxValue);

        //recursive work
        printArray(arr,idx+1);
    }

        //DEKHO UPR WALE SE BHI ANS AA RHA H BUT PW PE
        // NICHE WALA SOLUTION BTAYA SO dusre is m likh rhi hu



    public static void main(String[] args) {
        int[]arr={11,6,10,4,2,1};
        printArray(arr,0);
    }
}
