import java.util.Scanner;

public class SecLargest {
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
