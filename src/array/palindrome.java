package array;

public class palindrome {
    public static boolean isPalindrome(char[] arr, int left, int right) {
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }
        return true;  // Is a palindrome
    }

    public static void main(String[] args) {
        // Example input
        char[] arr = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};

        int start = 0; // start index of substring
        int end = 6;   // end index of substring

        if (isPalindrome(arr, start, end)) {
            System.out.println("The substring is a palindrome.");
        } else {
            System.out.println("The substring is not a palindrome.");
        }
    }
}