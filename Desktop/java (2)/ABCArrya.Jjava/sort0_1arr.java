import java.util.Scanner;

public class sort0_1arr {

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
        }
        static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp; 
        }
        static void sortZerosAndOne(int [] arr){
            int n = arr.length;
            int zeroes =0;
            // count number of zeros
            for(int i=0;i<n;i++){
                if(arr[i]== 0){
                    zeroes++;
                }
            }
            // 0 to zeroes-1:0, zeros to n-1:1
            for(int i=0;i<n;i++){
                if(i<zeroes){
                    arr[i]=0;
                }else{
                    arr[i]=1;
                }

            }
        }

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter thr size of array");
    int n = sc.nextInt();
    
    int[]arr=new int[n];
    System.out.println("enter" +n+ "element");
    for(int i=0;i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("original arrya" );
    printArray(arr);
    sortZerosAndOne(arr);
   
    System.out.println("sorted array");
    printArray(arr);
    
        
}
    }
    

