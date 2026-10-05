package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class couponCodeValidater {
    public static   List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashSet<String> set= new HashSet<>();
        Collections.addAll(set,"electronics","grocery","pharmacy","restaurant");

        List<String[]> tempList =new ArrayList<>();//[businessline ,code]

        for(int i=0;i<code.length;i++){
            //base case
            if(!isActive[i] || code[i].isEmpty())
                continue;//if yes to loop aage nhi chalega

            if(isAlphanumeric(code[i])&& set.contains(businessLine[i])&& isActive[i]) {
                tempList.add(new String[]{businessLine[i],code[i]});
            }
        }
        //sorting
        Collections.sort(tempList,(a,b)-> {
                    ;
                    if (!a[0].equals(b[0])) {
                        return a[0].compareTo(b[0]);
                    } else {
                        return a[1].compareTo(b[1]);
                    }
                });

        List<String>ans=new ArrayList<>();
        for(String[]item :tempList){
            ans.add(item[1]);
        }
        return ans;

    }
  static boolean  isAlphanumeric(String str){

        for(char ch  : str.toCharArray()){
            if(Character.isDigit(ch)|| Character.isLetter(ch)|| ch=='_')
                continue;
            return false;
        }
        return str.length()>0;
    }

    public static void main(String[] args) {

        //Solution sol = new Solution(); // object creation

        String[] code = {"SAVE20", "", "PHARMA5", "SAVE@20"};
        String[] businessLine = {"restaurant", "grocery", "pharmacy", "restaurant"};
        boolean[] isActive = {true, true, true, true};

        List<String> result = validateCoupons(code, businessLine, isActive);

       System.out.println(result);

    }
}
