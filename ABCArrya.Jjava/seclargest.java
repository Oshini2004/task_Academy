// import java.util.Scanner;

// public class seclargest {

//     static int[] lar(int[] arr){
//         int mx = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>mx){
//                 mx=arr[i];
//             }
//         }
//         return mx;
//     }
//     static int seclargest(int[]arr){
//         int mx = lar(arr);

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]== mx){
//                 arr[i]=Integer.MIN_VALUE;
//             }
//         }
//         int seclargest=lar(arr);

//         return seclargest;


//     }
//      public static void main(String[] var0) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter array size");
//       int n = sc.nextInt();

//       int[]arr = new int[n];
//       System.out.println("enter" + n + "elements");
//       for(int i= 0; i< arr.length;i++) {
//          arr[i] = sc.nextInt();
         
//       }
//       System.out.println("enter x");
//       int x=sc.nextInt();

      
//       System.out.println(seclargest(arr));
//    }
// }
import java.util.Scanner;

public class seclargest {
    static int findMAX(int[]arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>mx){
                mx= arr[i];
            }
        }
        return mx;
    }
    static int findSecLargest(int[] arr){
        int mx = findMAX(arr);

        for(int i=0; i<arr.length;i++){
            if ((arr[i]==mx)) {
                arr[i]=Integer.MIN_VALUE;
                
            }
        }
        int SecondMax=findMAX(arr);
        return SecondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size  "  );
        int n =sc.nextInt();
        int[] arr =new int [n];
        
        System.out.println("enter  "+n+ "  element ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("second largest  " + findSecLargest(arr));
    }
    
}
