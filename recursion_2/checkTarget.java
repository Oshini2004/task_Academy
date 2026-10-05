package recursion_2;

//Q. check if target is present in array using recursion 
public class checkTarget {
    private boolean checktargrt ( int arr[],int idx, int target ){

        //base case 
        if(idx ==arr.length) return false;  
        if(arr[idx]==target) return true;
        return checktargrt(arr, idx+1, target)
    }
    public static void main(String[] args) {
        int arr[]={7,6,1,4,5,8,0,2};
        int target=11;
    }
    
}


//o(2n)=o(n) space comp
//o(n) time comp 