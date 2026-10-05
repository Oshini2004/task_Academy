package array;

public class largestSubArray_kadanesAlgo {

    public static void main(String[] args) {
        int[]arr={1,4,-2,5,6,7,-3,4,5};
        int n= arr.length;

        int maxSum=0;
        int currSum=0;

        for(int i=0;i<n;i++){
            currSum=currSum+arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
       // return maxSum;

    }
}
///NA YE ALGO SAMJH AA RHA HAI YE YE CODE LIKHTE AA RHA H//////////
