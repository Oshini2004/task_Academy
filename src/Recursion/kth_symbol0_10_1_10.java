//on the first row, we write a 0.now in every subsequent row,we look at the previous
//row and replace rech occurrence of 0 with 01, and eacg occurrence of 1 with 10.

//give row no. A and index b, return the Bth indexed symbol in row A

package Recursion;

public class kth_symbol0_10_1_10 {
    public static String modifyString(String s){
        StringBuilder sb = new StringBuilder( );
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='0'){
                sb.append("01");
            }
            else{
                sb.append("10");
            }
        }
        return sb.toString();
    }
    public static int generate(String s, int i,int A,int B){
        if(i==A){
            return (int)(s.charAt(B)-'0');
        }
        //otherwise
        String s_dash = modifyString(s);
       return  generate(s_dash,i+1,A,B);
    }

    public static void main(String[] args) {
      //  System.out.println(modifyString("0110"));
        System.out.println( );
        System.out.println(generate("0",0,5,2));
    }
}
