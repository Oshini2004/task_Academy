package oopsin.java;

public class understandingOpps {
    public static void change(Student s){
        s.name ="Radha";

    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name=" Raghav";
        s1.percent=92.1;
        System.out.println(s1.getRno());
    }


    // public static int fun(int x){
    //     System.out.println(x);
    //     return;
    
    // }
    // public static void main(String[] args){
    //     int x=6;
    //     fun(x+5);
    // }




    // //creating new data type
    // public static void main(String[] args){
    //     class Student{
    //         String name;
    //         int rno;
    //         double percent;
    //     }
    //     Student s1 = new Student();
    //     s1.name ="Oshi";
    //     s1.rno =76;
    //     s1.percent=92.5;
    //     System.out.println(s1.name);

    //     Student s2 = new Student();
    //     s2.name ="Ram";
    //     s2.percent =87.2;
    //     s2.rno =3;
    //     System.out.println(s2.name);


    // }

    
}
