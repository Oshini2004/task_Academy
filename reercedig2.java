// import java.util.Scanner;

// public class countDigit {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sumofdigit= 0;
//         int original_n = n;

//         while(n > 0)
//         {
//             sumofdigit+=n%10;
//             n=n/10;
            

//         }
//         System.out.println("number of digit"+ original_n + "=" + sumofdigit );
        
//     }
// }






// import java.util.Scanner;
// public class sumseries{
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();

//         int ans =0;
//         for(int i=1;i<=n; i++ ){
//             if(i%2==0){
//                 ans-=i;
//             } else {
//                 ans+= i;
//             }
//         }
                    
//             System.out.println(ans);
//             }
//         }



import java.util.Scanner;
public class reercedig2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        int ans =0;
        

        while (n>0) {
            ans= ans*10 + n%10;
            n/=10;
            
        }
    
    System.out.println(ans);
    }



    }

            
        
    
    