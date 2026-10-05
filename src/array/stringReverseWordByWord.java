package array;

public class stringReverseWordByWord {
    public static void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void ReverseEachWord(char[] str){
       int n=str.length;
        int start=0;

        for(int i=0;i<=n;i++){
            // If we encounter a space or reach the end, reverse the current word
            if(i==n|| str[i]==' '){
                reverse(str,start,i-1);
                start=i+1; //move to next word
            }
        }
    }

    public static void main(String[] args) {

        char[] arrStr = {'i',' ','l','o','v','e',' ','j','a','v','a',' ','p','r','o','g','r','a','m','i','n','g',' '};

        // Reverse the entire array
        reverse(arrStr, 0, arrStr.length - 1);

        //  Reverse each word to fix the characters
        ReverseEachWord(arrStr);

        // Print the final result
        for (char c : arrStr) {
            System.out.print(c);
        }

    }

}
