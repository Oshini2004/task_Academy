//  class ArryaExample {                                                      // ArryaExample.java
//     void sumofArray(){
//         int [] arr = {1,4,5,6,1};
//         int sum =0 ;

//         for(int i =0; i<arr.length; i++){
//             sum = sum +arr[i];
//         }
//         System.out.println(sum);
//     }

        
//         public class Main{
//             public static void main(String[] args) {
//                 ArryaExample obj = new ArryaExample();
//                 obj.sumofArray(); 
//             }
        
            
//         }
//     }


class ArryaExample {
    void sumArray() {
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
public class sumofArray {
    public static void main(String[] args) {
        ArryaExample obj = new ArryaExample();
        obj.sumArray(); 
    }
}