package Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutationL_46 {
    public List<List<Integer>> permute(int []nums){
        List<List<Integer>>resultList=new ArrayList<>();

        backtrack(resultList,new ArrayList<>(),nums);
        return resultList;
    }
    private void backtrack(List<List<Integer>>resultList,ArrayList<Integer>tempList,int[]nums){
        //if we match the length ,it is a permutation
        //base case
        if(tempList.size()== nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
         for(int el:nums){
            //skip if we get same element
            if(tempList.contains(el))
                continue;
            //add the new element
            tempList.add(el);
            //go back to try other element
            backtrack(resultList,tempList,nums);
            //remove the element
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {

    }

}
