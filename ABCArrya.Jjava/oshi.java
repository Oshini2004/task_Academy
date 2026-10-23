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


// import java.until.Scanner;

// public class App {
//     static void change_array(int[]arr){
//         for(int i=0;i<arr.lenght;i++){
//             arr[i]=0;
//         }
//     }
//     public static void main(string[] args){
//         int[] arr = new int [3];
//         arr[0]=5;
//         arr[1]=6;
//         arr[2]=7;
//         change_array(arr);

//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
    
// }
import java.util.Arrays;
import java.util.Scanner;
public class oshi{
    
    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            //go through ith row
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+ " ");
            }
            //new line after every row
            System.out.println();
        }
    }
    
    public static int[][] createArrayInput(){
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int columns =sc.nextInt();
        //creating
        int[][] arr=new int [rows][columns];
        //user input row by row
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
        
    }
    public static void twoDarray(){
        int[][]arr={{1,2,3},{4,5,7,6},{7,8,9,18,11}};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        
        System.out.println(arr.length);
        //loop to iterate over 2Darray
        arr[1][1]=15; //update
        printArray(arr);
    }
    public static void main(String[] args){
        //create
        int[][]arr=createArrayInput();
        printArray(arr);
        
    }
}