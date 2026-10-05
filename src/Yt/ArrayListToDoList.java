package Yt;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToDoList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<String>tasks =new ArrayList<>();

        boolean isTrue=true;

        while(isTrue){
            System.out.println( "Menu------");
            System.out.println("1: add task----");
            System.out.println("2----view task----");
            System.out.println("3---Remove Task---");
            System.out.println("4----Exit---");
            System.out.println(" ");
            System.out.println("which operation do you want to perform");

            int choice= sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter task = ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("task added");
                    break;

                case 2:

            }
        }
    }

}
