package array;

public class string_subPart_Reverse {
    public static String reversePart(String arr_str,int start,int end ){
        char[] arr= arr_str.toCharArray();//convert to char array

        int left =start;
        int right =end;
        // Two-pointer approach to reverse the substring
        while(left<right){
            // Swap characters at left and right
            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            // Move pointers inward
            left++;
            right--;
        }
        return new String(arr); // Convert back to string

    }

    public static void main(String[] args) {
        String arr_str="oshiniJadhav";
        int start =2;
        int end =7;
        String result =reversePart(arr_str,start,end);
        System.out.println(result);
    }
}
