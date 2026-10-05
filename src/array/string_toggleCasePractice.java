package array;

public class string_toggleCasePractice {
    public static void toggleCaseEvenIndices(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // Even index
                if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    // Convert uppercase to lowercase
                    arr[i] = (char)(arr[i] + 32);
                } else  {//if (arr[i] >= 'a' && arr[i] <= 'z') {
                    // Convert lowercase to uppercase
                    arr[i] = (char)(arr[i] - 32);
                }
                // Non-alphabet characters remain unchanged
            }
        }
    }
    public static void main(String[] args) {
        // Example array
        char[] arr = {'o','s','h','I','N','i'};

        // Toggle case at even indices without library functions
        toggleCaseEvenIndices(arr);

        // Print the result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


}
