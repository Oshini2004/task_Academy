package array;

import java.util.Scanner;

public class binaryToDecimal {
    public static int BtoD(int num) {
        //  int num = 110;
        int ans = 0;
        int power = 0;
        int last_digit = 0;

        while (num > 0) {
            last_digit = num % 10;
            ans = ans + last_digit * power;
            num = num / 10;
            power = 2 * power;
        }
        return ans;
    }


    
}
