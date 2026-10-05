package array;

public class findSubArray {

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int n= arr.length;

        int count=0;
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                count++;
                //in order to print subarray from st to end we need another loop//
                for(int i=start;i<=end;i++){
//count++;
                    System.out.print(arr[i]);
                }
               System.out.println(" ");
            }
            //count++;
        }
        System.out.println(" total number of subarray" +count);
    }
}
/////////////////time comp=o(N^30)//////////
////////////////space comp =o(1)//////////coz not using extra space//////