public class OPPdogdemo{
    String name;
    String bread;
    int age;

    Dog(){
        System.out.println("making dog as object");
    }

    //functionality later on...
    void introduce(){
        System.out.println(" hi , i am " +name);
    }
    int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Dog d1 =new Dog();
        d1.name ="Bruno";

        Dog d2 =new Dog( );
        d2.name=" cruto";

        System.out.println(d1.name+ "fighting with" +d2.name);
        d1.introduce();
        d2.introduce();
        System.out.println(d1.age);
        System.out.println(d1.getAge());

    }
}
    
  