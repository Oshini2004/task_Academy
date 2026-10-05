package Recursion;

public class possPath_mXnDestinationoSource {
    static int ways (int r,int c){
        //base case
        if(r==0|| c==0){
            return 1;
        }
        return ways(r-1,c)+ways(r,c-1);
    }

    public static void main(String[] args) {
        int r =3,c=3;
        System.out.println(ways(r-1,c-1));
    }
}
