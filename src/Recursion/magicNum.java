package Recursion;

public class magicNum {
    // Recursive function to find the sum of digits
    public static int sumOfDigits(int n) {
        // Base case: single digit
        if (n < 10)
            return n;

        int sum = 0;

        // Add all digits
        while (n > 0) {
            sum += n % 10;  // extract last digit and add
            n /= 10;        // remove last digit
        }

        // Recursive call on the sum obtained
        return sumOfDigits(sum);
    }

    // Function to check if number is magic
    public static boolean isMagic(int n) {
        // Get the single-digit sum
        int result = sumOfDigits(n);

        // Magic number if the result is 1
        return (result == 1);
    }

    public static void main(String[] args) {
        int num = 19;  // Example number

        if (isMagic(num))
            System.out.println(num + " is a Magic Number!");
        else
            System.out.println(num + " is NOT a Magic Number!");
    }
}
