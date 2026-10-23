import java .util.Scanner;
public class prefixSum_1_baseInduxing {

    //   static void printArray(int[] arr){
    //     int n = arr.length;
    //     for(int i =0;i<n;i++){
    //         System.out.print(arr[i]+ "  ");
    //     }
    //     System.out.println();
    // }
    
    
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
    int[] arr= new int[n+1];

    System.out.println("enter  " +n+ "  element");
    for(int i=1;i<=n;i++){
        arr[i]=sc.nextInt();
    }

  
    int[] prefSum=makePrifixSumArray(arr);
    System.out.println("enter number of queries");
    int q=sc.nextInt();

    while(q-->0){
        System.out.println("enter range");
        int l=sc.nextInt();
        int r = sc.nextInt();  

        int ans = prefSum[r]-prefSum[l-1];
        System.out.println("sum  " + ans);
    }

    
}
}

    

