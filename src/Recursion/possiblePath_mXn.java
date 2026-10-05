package Recursion;

public class possiblePath_mXn {
    static int Ro = 3, Co = 3;

    static int ways(int r, int c) {
        //base case
        if (r == Ro - 1 || c == Co - 1) {
            return 1;
        }
        return ways(r + 1, c) + ways(r, c + 1);
    }

    public static void main(String[] args) {
        int r = 3, c = 3;
        System.out.println(ways(0, 0));

    }
}
