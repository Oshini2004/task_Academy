public class ReverceArray {

  /////  //creating method to call array  again&again

    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ "  ");
        }
       System.out.println();
    }


    // static int[] reverseArr(int[] arr){
    //     int n =arr.length;
    //     int[] ans =new int[n];
        //int j =0;

   ////     //traverse original array in reversee direction
      //  // for(int i=n-1;i>=0;i--){
        ////     ans[j++]=arr[i];
        //// }

//         int i=n-1,j=0;
//         while(i>=0){
//             ans[j++]=arr[i--];
//         }
//         return ans;

//     }
//     public static void main(String[] args){
//         int [] arr= {1,2,3,4,5};
//         int[] ans = reverseArr(arr);
//         printArray(ans);

//     }
    
// }

static void swapInArray(int[] arr, int i, int j){
    int temp =arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

}
static void reverseArray(int[] arr){
    int i=0,j=arr.length-1;

    while(i<j){
        swapInArray(arr, i, j);
        i++;
        j--;
    }

}
public static void main(String[] args){
    int[]arr={1,2,3,4,5,6};
    reverseArray(arr);
    printArray(arr);
}
}
  