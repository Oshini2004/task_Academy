import java.util.Scanner;

public class largestString {

    // public static void readInput(){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextLine();
    //     //consume first enter
    //     sc.nextLine();

    //     int largestLen=0;
    //     String largestString = " ";

    //     for(int i=1;i<=n;i++){
    //         String line =sc.nextLine();
    //         if(line.length()>largestLen){
    //             largestString=line;
    //             largestLen=line.length();
    //         }
    //     }
    //     System.out.println(largestString);

    // }
    public static void filterFiles(){
        String[] filenames ={"img.jpg","img2.png","d1.pdf","apple.pdf","image2pdf.jpg","oshi.pdf"};
        for(String f: filenames){
            if(f.endsWith(".pdf")){
                System.out.println(f);
            }
        }
         
    }
    public static void printOcc(){
        String doc ="this is a very large document on java,i am focused about my studies,large amount ";
        String word ="large"; 

        int idx =doc.indexOf(word);
        //System.out.println(idx);
        
        while(idx!=-1){
            System.out.println(idx);
            //find the next occ
            idx=doc.indexOf(word, idx+1);
        }
    }
    public static void main(String[] args) {
       // readInput();
       filterFiles();
       printOcc();

       String s= "I am rich";
       System.out.println(s.length());
       System.out.println(s.toUpperCase());
       System.out.println(s);
       s=s.toLowerCase();
       System.out.println(s);

         

       String n= "oshi  ";
       System.out.println(n.length());
       System.out.println(n.strip());
       System.out.println(n.strip().length());

       //string concanitaion
       String hi="hello" +"world";
       System.out.println(hi);
       System.out.println("hello" +7);

       String greet ="hi everyone hi all";
       System.out.println(greet.indexOf("hi"));
       System.out.println(greet.indexOf("hi",1));
    }
    
}
