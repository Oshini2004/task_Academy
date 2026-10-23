import java.util.Scanner;
public class RepeatingNum {

    static int[] firstRepNum( int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;i++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
     
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size  "  );
        int n =sc.nextInt();

        int[] arr =new int [n];
        System.out.println("enter  "+n+ "  element ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("repeating no.  " + firstRepNum(arr));
    }
}
    


    

