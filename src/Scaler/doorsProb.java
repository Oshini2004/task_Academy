package Scaler;

import java.util.Arrays;

public class doorsProb {
    public static void main(String[] args) {
        int[] doors=new int[101];//doors[1] to doors[100]

        //for 100 rounds
        for(int round=1;round<=100;round++){
            for(int D=round;D<=100;D=D+round){
                doors[D]=1-doors[D];//convert 0->1 OR 1->0
            }
        }


        //count &print doors //by checking door[i]=0

//        int count =0;
//        System.out.println("open doors");
//        for(int round=1;round<=100;round++){
//            if(doors[round]==1){
//                count++;
//                System.out.println(round+" ");
//            }
//        }
//        System.out.println("total no. od doors after 100 round" +count);
    }
}
