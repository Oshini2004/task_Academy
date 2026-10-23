public class continuekey {
    public static void main(String[] args) {
        int num=0;
        while(num <=50){
            if(num % 3 == 0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
        
        
//         for(int num =1; num<=50; num++){
//             if(num% 3==0){
//                 continue;
//             }
//             System.out.println(num);
//         }
//     }
// }
