package Recursion;

public class serchIndex_returnX {
    static int findIndex(int[]arr,int n,int target,int idx){
        //base case
        if(idx>=n) return -1;
        //self work
        if(arr[idx]==target) return idx;
        return findIndex(arr,n,target,idx+1);
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,5,6};
        int target=4;
        int n=arr.length;
        System.out.println(findIndex(arr,n,target,0));
    }

}
