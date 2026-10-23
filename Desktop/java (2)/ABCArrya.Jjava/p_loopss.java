// import java.util.Scanner;

// public class practice {

//     static int countocc (int[] arr,int x){
//         int count =0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x){
//                 count++;

//         }
//           }
//           return count;


//     }
    
// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.println("enter the size of array");
//     int n= sc.nextInt();

//     int[]arr=new int[n];
//     System.out.println("enter" +n+ "array");
//     for(int i=0;i>arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("enter x");
//     int x=sc.nextInt();

//     System.out.println("COUNT OF X" +countocc(null, x));
// }
    
// }

// import java.util.Scanner;
// import java.util.scanner;

// public class practice{
//     static int pairsum(int arr[],int target){
//     ans= 0;
//     for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             for(int k=j+1; k<arr.length:k++){
//                 if(arr[i]=arr[j]=arr[k]== target){
//                     ans++;
//                 }
//             }
//         }
//     }
//     return ans;

// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter array size");
//     int n = sc.nextInt();

//     int [] arr =new int [n];
//     System.out.println("enter " + n + "element");
//     for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("enter target");
//     int target=sc.nextInt();

//     System.out.println("PairSum of target" +pairsum(arr, target));
// }


// }

import java.util.Scanner;

public class p_loopss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int n =10;
        int i=1;
        while(i<=n){
            System.out.println(i);
            i=i+1;
        }
    }
}