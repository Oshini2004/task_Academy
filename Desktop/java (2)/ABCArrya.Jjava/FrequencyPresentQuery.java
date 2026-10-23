// import java.util.Scanner;

// public class frequency_presentQuery {

//     static int[] makefrequencyArray(int[] arr){
//         int[] freq=new int[100005];

//         for(int i=0;i<arr.length;i++){
//             freq[arr[i]]++;
//         }
//         return freq;
//     }
    

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enterarray size");
//     int n= sc.nextInt();
//     int[] arr = new int[n];

//     System.out.println("enter" +n+ "element");
//     for(int i=0; i<n; i++){
//         arr[i]=sc.nextInt();
//     }
//     int[] freq= makefrequencyArray(arr);
//     System.out.println("enter number of queries");
//     int q=sc.nextInt();

//     while(q>0){
//         System.out.println("enter number to be searched");
//         int x=sc.nextInt();
//         if(freq[x]>=0 && freq[x]<freq.length && freq[x]>0){
//             System.out.println("YES");
//         }
//         else{
//             System.out.println("NO");
//         }
//         q--;
//     }
// }
// }


import java.util.Scanner;

public class FrequencyPresentQuery {
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter number to be searched:");
            int x = sc.nextInt();

            if (x >= 0 && x < freq.length && freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }

        sc.close();
    }
}