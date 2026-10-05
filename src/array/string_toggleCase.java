package array;

public class string_toggleCase {

    public static void toggleCaseEven(char[] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>='A'&& arr[i]<='Z'){
                    arr[i]=(char)(arr[i]+32);
                }else {
                    arr[i]=(char)(arr[i]-32);
                }
            }
        }
    }

    public static void main(String[] args) {
        char[]arr={'o','s','h','I','N','i'};

        toggleCaseEven(arr);

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
       // toggleCaseEven(arr);
    }
}
