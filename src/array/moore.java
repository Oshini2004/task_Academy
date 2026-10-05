package array;

public class moore {
    public static int majority (int [] arr){
        int n= arr.length;
        int element =arr[0];
        int frequency=1;
        for(int i=0;i<n;i++){
            if(frequency==0){
                element=arr[i];
                frequency=1;
            } else if (element==arr[i]) {
                frequency++;
            }else {
                frequency=frequency-1;
            }
        }
        int count=0;
        for (int i=0;i<n-1;i++){
            if(arr[i]==element){
                count++;
            }
            if(count==n/2){
                System.out.println("value "  +element);
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int []arr={2, 2, 1, 1, 2, 2, 2};
        int result=majority(arr);
        System.out.println("majority element is " +result);
    }
}
