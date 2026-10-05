package array;

public class bitmaskingAnd {
    //helping function
   static int countNumber(int arr[],int pattern){
        int count =0;
        for(int x:arr){
            if((x & pattern)==pattern){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={21,18,25,17,16};
        int n= arr.length;

        int pattern =0;
        for(int i=31;i>=0;i--){
            //count the no of numbers having given pattern
            int count =countNumber(arr,pattern| (1<<i));
            if(count>=2){
                //actually update the pattern by setting ith bit
                pattern=(pattern|(1<<i));
            }
        }
        System.out.println(pattern);
    }
}
