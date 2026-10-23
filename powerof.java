// public class MulOf5and7 {

//     public static void main(String[] args) {
//         int num =1;
//         while(true){
//             if ((num % 5 == 0)&& (num % 7 ==0)){
//                 System.out.println("found ans" + num);
//                 break;
//             }
//             num++;
//         }
//     }
// }


import java.util.Scanner;
public class powerof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        

        for(int i = 1;i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.println("*");
            }
        System.out.println("#");
        }

    }

    
}