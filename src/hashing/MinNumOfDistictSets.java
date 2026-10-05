package hashing;
import java.util.HashMap;
import java.util.HashSet;

public class MinNumOfDistictSets {
    public static int findMinNumOfSets(int arr[]){
        int result=0;
        int n=arr.length;

        boolean arrvisited [] =new boolean[n];

        for(int i=0;i<n;i++){ //ye true or false de dega

            if(arrvisited[i]){    //initialy yha sb false hi hoge
                continue;
            }
            result++;

            HashSet<Integer>set =new HashSet<>();
            for(int j=i;j<n;j++){
                if(arrvisited[j] || set.contains(arr[j])){
                    continue;   //skip
                }
                arrvisited[j]=true;
                set.add(arr[j]);
            }
        }
   return result;
    }

    public static int findMinNumOfSets_2(int arr[]){
        int maxFreq=0;
        int n= arr.length;

        HashMap<Integer,Integer>frqMap=new HashMap<>();
        for(int i=0;i<n;i++){
            frqMap.put(arr[i],frqMap.getOrDefault(arr[i],0)+1 );
            maxFreq=Math.max(maxFreq,frqMap.get(arr[i]));
        }
        return maxFreq;
    }
    public static void main(String[] args){
        int arr[] ={2,1,4,1,6,5,5,5};
        int res =findMinNumOfSets(arr);
           int result= findMinNumOfSets_2(arr);
        System.out.println("Minimum number of subsets => " +res);
          System.out.println("Minimum number of subsets => " +result);
    }
}
