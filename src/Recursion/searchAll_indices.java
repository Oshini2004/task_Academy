package Recursion;

public class searchAll_indices {
    static void findAllIndices(int[] arr, int n, int target, int idx) {
        //base case
        if (idx >= n) {
            return;
        }
        //self work
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        //recursive work
        findAllIndices(arr, n, target, idx + 1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        int n = arr.length;
        findAllIndices(arr,n,target,0 );


    }
}
