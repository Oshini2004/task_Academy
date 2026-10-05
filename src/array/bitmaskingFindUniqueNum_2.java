package array;

public class bitmaskingFindUniqueNum_2 {
    public static void uniqueNum(){
        int []arr={7,6,4,5,4,5,7,8};

        //do xor for all
        int xor=0;
        for(int x:arr){
            xor=xor^x;
        }
        //step2 find out the postion of rightmost set bit
        int pos=0;
        int temp=xor;
        while((temp&1)!=1){
            temp=temp>>1;
            pos++;
        }
        //step 3 filter out no. from the array which have 1 at given pos
        int setA=0;
        int  setB=0;
        for(int x:arr){             //you can also do
            if((x &(1<<pos))>0){    //xor=xor^x;
                setA=setA^x;
            }else {
                setB= setB^x;
            }
        }
        System.out.println(setA);
        System.out.println( setB);//System.out.println(xor^setA);
    }

    public static void main(String[] args) {
        uniqueNum();
    }
}
