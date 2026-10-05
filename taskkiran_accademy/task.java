package taskkiran_accademy;

public class task {
    //1. hello world by YOUR_NAME
    public static void main(String[] args) {
        System.out.println("my name is  Oshini Jadhav");
    }
    //2.create 2 variable cost_price, selling_price and cal. the profit or loss
    int cost_price = 500;
    int selling_price = 700;

        if (selling_price > cost_price) {
            int profit = selling_price - cost_price;
            System.out.println("Profit is : " + profit);
        }
        else if (cost_price > selling_price) {
            int loss = cost_price - selling_price;
            System.out.println("Loss is: " + loss);
        }
        else {
            System.out.println("Nothing ");
        }
    
    //3. Check Whether Number is Odd or Even
     int num = 10;

        if (num % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
        //4. Check Age is Valid and Eligible for Voting
        int age = 21;

        if (age < 0) {
            System.out.println("Invalid Age");
        }
        else if (age < 18) {
            System.out.println("Age is valid but not eligible for voting");
        }
        else {
            System.out.println("Age is valid and also eligible for voting");
        }

//5. Check Whether Two Words are Anagrams
 String word1 = "grow";
        String word2 = "worg";

        char[] str1 = word1.toLowerCase().toCharArray();
        char[] str2 = word2.toLowerCase().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2)) {
            System.out.println(" Anagrams");
        }
        else {
            System.out.println(" not Anagrams");
        }
}
