// Idea / Intuition

//We can use a HashSet to store prefix sums:
//Compute prefix sum while traversing the array.
//If at any point:
//The prefix sum becomes 0, OR
//The prefix sum is already seen before,
//then there exists a subarray with sum 0.
//Because:

//When two prefix sums are equal, the elements between them sum to 0.

//🧠 Algorithm
//1) Initialize a HashSet<Integer> to store prefix sums.
//2)Initialize sum = 0.
//3)Traverse each element num in array:
//Add num to sum.
//If sum == 0 or set.contains(sum), return true.
//Otherwise, add sum to set.
//4)If loop ends, return false.


package hashing;

import java.util.HashSet;

public class ZeroSumSubarray {
    public static boolean hasZeroSumArray (int arr[]){
        HashSet<Integer> set =new HashSet<>();
        int sum =0;

        for(int num=0;num< arr.length;num++){
            sum=sum+num;
            if(sum==0|| set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={4,2,-3,1,5,2,6,4};
        if(hasZeroSumArray(arr))
            System.out.println("Yes, Subarray with zero sum exists");
        else
            System.out.println("no,does't exists");
        }
    }

