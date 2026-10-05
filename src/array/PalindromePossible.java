package array;
//given a string A consisting only of lowercase chars you can swap any 2 charaters
// of string A any number of times. return 1 if it is possible to convert the string
// A to a palindromic string

public class PalindromePossible {
    public static int canBePalindrome(String A) {
        int freq[]= new int [26];

        for(char c:A.toCharArray()){
            freq[c-'a']++;
        }
        int oddcount =0;

        for(int count:freq){
            if(count%2 !=0){
                oddcount++;
            }
        }
        if(oddcount>1)
            return 0;
        else
            return 1;
        }

    public static void main(String[] args) {
        System.out.println(canBePalindrome("aabc"));
        System.out.println(canBePalindrome("abbzbba"));
    }
    }


