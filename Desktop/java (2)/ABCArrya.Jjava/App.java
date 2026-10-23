// import java.util.Scanner;

// public class input {

//     static void printArray(int[] arr){
//         for(int i =0; i<arr.length; i++){
//             System.out.println(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);

//         System.out.println("enter size of array");
//         int n = sc.nextInt();
//         int[] arr = new int[5]; 
//         arr[0]=5;
//         arr[1]=6;
//         arr[2]=7;
//         arr[3]=8;
//         arr[4]=9;

//         // 
//        // //  for(int i=0;i<n; i++){
//         ////     System.out.println(arr[i]+ " ");
//         //// }
//         /// 
//         System.out.println("original array");
//         printArray(arr);
//        // //  for(int i= 0; i<n; i++){
//         ////     System.out.println(arr[i] + "");
//         //// }

//         //trying to copy arr to arr_2
//         int[] arr_2 = arr;
//         System.out.println("copied aee_2");
//         printArray(arr_2);
//                                                         // for(int i =0; i<n; i++){
//                                                        //     System.out.println(arr_2[i] + " ");
//         }
        
//     }
    
// }


import java.until.Scanner;

public class App {
    static void change_array(int[]arr){
        for(int i=0;i<arr.lenght;i++){
            arr[i]=0;
        }
    }
    public static void main(string[] args){
        int[] arr = new int [3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        change_array(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
