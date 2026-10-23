import java.util.Scanner;

class main4 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int size = 0;
    System.out.println("enter the size of array=");
    size = s.nextInt();
    int[] x = new int[size];
    System.out.println("enter element of array");
    for (int i = 0; i < 5; i++) {
      x[i] = s.nextInt();
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(x[i]);
    }

  }
}
