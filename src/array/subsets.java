package array;

import java.util.ArrayList;

public class subsets {
    static void filter(int no,int []arr){
        ArrayList<Integer>list=new ArrayList<>();
        int j =arr.length-1;

        while(no>0){
            int lastBit=(no&1);
            if(lastBit==1){
                list.add(0,arr[j]);
              //  list.add(arr[j]);
            }
            j--;
            no=no>>1;
        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int n =arr.length;

        for(int i=0;i<(1<<3);i++){
            System.out.println(i);
            filter(i, arr);
        }
    }
}
