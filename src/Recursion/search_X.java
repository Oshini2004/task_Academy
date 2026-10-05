package Recursion;

public class search_X {
    static boolean search(int[]arr,int n,int target,int idx) {
        //base case
        if (idx >= n) {
            return false;
        }
        //self work
        if (arr[idx] == target) return true;
        //recursive work
        return search(arr, n, target, idx + 1);
    }
//        if(search(arr,n,target,idx+1)){
//            return true;
//        }else{
//            return false;
//        }
public static void main(String[] args) {
    int []arr={1,2,4,6};
    int target=64;
    if(search(arr,arr.length,target,0)){
        System.out.println("yes");
}else{
        System.out.println("no");
    }

    }
}
