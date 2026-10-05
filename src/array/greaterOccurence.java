////given an array N element, count the number of element having
// atleast 1 element greater than itself in jav///////////////////
package array;

public class greaterOccurence {

    public static void main(String[] args) {

        int[] arr = {-3,-2,6,8,4,8,5,8,2,8,-6};
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == largest) {
                count++;
            }
        }
        System.out.println(n - count);
    }
}


