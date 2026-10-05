package array;

//package array;
//
//public class palindromeLargest {
//    public int expand(char[] str, int p_1, int p_2) {
//
////        p_1 = i;
////        p_2 = i;
//        while (p_1 >= 0 && p_2 <= str.length && str[p_1] == str[p_2]) {
//            p_1--;
//            p_2++;
//        }
//        return p_2 - p_1 - 1;
//    }
//
//    public static void main(String[] args) {
//        char[] s={'a','b','c','b','a'};
//        int ans=0;
//        for (int i=0;i<s.length;i++){
//            int p_1=p_2=i;
//            ans =Math.max()
//        }
//    }
//}
public class palindromeLargest {
    public static boolean isPalindrome(int x) {
        String P =Integer.toString(x);
        int left=0;
        int right=P.length()-1;

        while(left<right){
            if(P.charAt(left) != P.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main (String[]args){
        int x=121;
        isPalindrome(x);
    }
}
