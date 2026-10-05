package array;

public class ReverseWordsInCharArray {



        static void reverseWords(char[] arr) {
            int n = arr.length;

            // Step 1: Reverse entire array
            reverse(arr, 0, n - 1);

            // Step 2: Reverse each word individually
            int start = 0;
            for (int end = 0; end <= n; end++) {
                // when we find space or reach end
                if (end == n || arr[end] == ' ') {
                    reverse(arr, start, end - 1);
                    start = end + 1; // move to start of next word
                }
            }
        }

        // Helper function to reverse a portion of the array
        static void reverse(char[] arr, int left, int right) {
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    public static void main(String[] args) {
        char[] arr = {'I',' ','l','i','k','e',' ','e','a','t','i','n','g',' ','a','p','p','l','e'};

        reverseWords(arr);

        System.out.println(arr);
    }

}
