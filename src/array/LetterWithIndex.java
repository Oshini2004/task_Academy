package array;

public class LetterWithIndex {
    // Convert the input string A to the required format
  public static String transform (String A) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < A.length(); i++) {
      char data =A.charAt(i);
      sb.append(data);
      int position =(data-'a')+1;
      sb.append(position);
     // sb.append(" ");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String input ="oshi";
    String output= transform(input);
    System.out.println(output);
  }
}
