package array;

import java.util.Arrays;

public class pairSum {
    public static void main(String[] args) {

        int[]arr={3,-2,4,6,-3,5};
        int n=arr.length;

        int[]pref=new int [n];
        pref[0]=arr[0];

        for(int i=1;i<=n-1;i++) {
            if (i % 2 == 0) {
                pref[i] = pref[i - 1] + arr[i];
            }
            else {
                pref[i]=pref[i-1];
            }
        }
        System.out.println(Arrays.toString(pref));

    }
}
