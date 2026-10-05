package Scaler;

import java.util.Arrays;

public class doorsProbWithSqRoot {


        public static void main(String[] args) {
            int[] doors=new int[101];//doors[1] to doors[100]

            //for 100 rounds
            for(int round=1;round<=100;round++){
                for(int D=round;D<=100;D=D+round){
                    doors[D]=1-doors[D];//convert 0->1 OR 1->0
                }
            }
            //isko print krne ki koi zarurat nhi thi pr mujhe out put dekhna tha isliye krdi
            System.out.println(Arrays.toString(doors));


            int i=1;
            int N=doors.length;
            while(i*i<=N){
                System.out.println(i*i);
                i=i+1;
            }


        }
    }

