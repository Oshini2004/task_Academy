package Recursion;

public class sumOfElement {

    static int sumOfArray(int[]arr,int idx){
        //base case
        if(idx== arr.length){
            return 0;
        }
        //recursive work-subprob
        int smallans=sumOfArray(arr,idx+1);
        //self work
        return smallans+arr[idx];
    }

    public static void main(String[] args) {
        int[]arr={5,16,17,8,9};
        System.out.println(sumOfArray(arr,0));
    }
}
