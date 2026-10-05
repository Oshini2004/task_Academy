package array;

public class moore_ {
    public static int findMajorityElement(int[]arr) {
        int element = -1;
        int freq = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                element = arr[i];
                freq = 1;
            } else if (element == arr[i]) {
                freq++;
            } else {
                freq = freq - 1;
                //freq--;
            }
        }
        freq = 0;
        for (int i = 0; i < n; i++) {
            if (element == arr[i]) {
                freq++; 
            }
        }
        if (freq > n / 2) {
            return element;
        } else {
            return -1; //no majority element
        }
}

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        int result = findMajorityElement(nums);

        if (result != -1) {
            System.out.println("Majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
    }
