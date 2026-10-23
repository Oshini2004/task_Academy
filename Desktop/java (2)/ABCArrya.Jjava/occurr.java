import java.util.Scanner;

public class occurr{
    static int countOccurrences (int[] arr, int x){
        int count =0;
        for(int i=0; i<arr.length;i++){
            if (arr[i]==x){
                count ++;
            }

            return count ;
        }
        public static void main(string[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array");
            int n= sc.nextInt();

            int []arr =new int [n];
            System.out.println("enter" +n+ "elements:");
            for(int i=0; i<arr.length; i++);
            arr[i]=sc.nextInt();
        } 
        System.out.println("enter x ");
        int x = sc.nextInt();
        System.out.println("count of X:" + countOccurrences(arr,x));
    }
}