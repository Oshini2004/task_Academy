package recursion_2;

public class print_Array { 

    private void printArray( int idx, int arr[]){
        //base case 
        if(idx == arr.length) return;
        System.out.println(arr[idx]+ " ");
        printArray(idx+1, arr);
    }


    ///for printing in reverse order 
    private void printReverseArray(int idx, int arr[]){
    //base case 
    if(idx==arr.length) return ;
    printReverseArray(idx+1, arr);
    System.out.println(arr[idx]+ " ");
}
    public static void main(String[] args) {
        int arr[] = {7,6,2,3,4,5,1,9};
        print_Array pr = new print_Array();
        pr.printArray(0, arr);
    }
}
//o(2n) time comp becouse ek br ja rhe hai ek br aa rhe hai 
//o(n) space kyuki pura resursion stack use kr rhe h 

