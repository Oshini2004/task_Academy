package array;
import java.util.Scanner;
public class JosephusProblem {
    public static int josephus(int n) {
        // Find the largest power of 2 less than or equal to n
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }

        // Formula: 2 * (n - p) + 1
        return 2 * (n - p) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int survivor = josephus(n);
        System.out.println("The last surviving person is at position: " + survivor);
    }

    {
    }
}