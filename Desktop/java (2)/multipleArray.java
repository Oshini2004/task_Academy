class ArryaExample {

    void multipleArray(){
        ////int [][]arr_1 = new int [5][3];
        int [][]arr={{54,67,55},{34,4,3},{66,87,22}};
        
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }
    
} 
    
public class multipleArray {
    public static void main(String[] args) {
        ArryaExample obj = new ArryaExample();
       // obj.demoArrays();
       obj.multipleArray();
    }

}


