import java.util.Scanner;
public class Main {

    static void printArray(int[]arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int []arr=new int [5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;

        // System.out.println("enter"+n+ "elements");
        // for(int i =0;i<arr.length;i++){
        //     arr[i]=sc.nextLine();
        // }
        System.out.println("original array");
        printArray(arr);         //for(int i=0;i<n;i++){
                                //System.out.println(arr[i]+ " ");

        }
        //copy arr to arr_2
        int [] arr_2  = arr;
        System.out.println("copied arr_2");
        printArray(arr_2);
                                   //for(int i=0; i<n; i++){
                                  //System.out.println(arr_2[i] + " ");
        }

        //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing arr_2");
        printArray(arr);

        System.out.println("copied arr_2 after changing arr_2");
        printArray(arr_2);
        
    

    
