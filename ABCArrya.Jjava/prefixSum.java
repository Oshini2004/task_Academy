// import java.util.Scanner;

// public class prifixSum{
//      static void printArray(int[] arr){
//         int n = arr.length;
//         for(int i =0;i<n;i++){
//             System.out.print(arr[i]+ "  ");
//         }
//         System.out.println();
//     }
    
    
//         static int[] makePrifixSumArray(int[] arr){
//         int n= arr.length;
//         int[] pref= new int[n];
//         pref[0] = arr[0];

//         for(int i=1;i<n; i++){
//             pref[i]= pref[i-1]+ arr[i];
//         }
//         return pref;
//     }
    
    
    

// public static void main(String[] args){
//     Scanner sc= new Scanner(System.in);
//     System.out.println("enter array size");
//     int n = sc.nextInt();
//     int[] arr= new int[n];

//     System.out.println("enter" +n+ "element");
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("input array");
//     printArray(arr);

//     int[] pref=makePrifixSumArray(arr);
//     printArray(pref);
// }
// }

import java.util.Scanner;
public class prefixSum {

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
    }
    
    
        static int[] makePrifixSumArray(int[] arr){
        int n= arr.length;
        for(int i=1;i<n; i++){
            arr[i]=arr[i-1]+ arr[i];
        }
        return arr;
    }

public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter array size");
    int n = sc.nextInt();
    int[] arr= new int[n];

    System.out.println("enter" +n+ "element");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("input array");
    printArray(arr);

    int[] pref=makePrifixSumArray(arr);
    printArray(pref);
}
}
