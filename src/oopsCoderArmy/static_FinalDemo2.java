package oopsCoderArmy;

public class static_FinalDemo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;
        x = 4;
        System.out.println(x);
    }
}

//why main is static in java ??
// Demo4 d1 = new Demo4();
// d1.main()
// Demo4.main()

class Random {
    static final double PI;

    static {
        PI = 3.14;
    }
}
//Static Keyword (0:45): Used for creating class-level variables and methods that are shared across all instances of a class,
// rather than being specific to one object. The video also covers the rules for static members, such as why a static method
// can only call other static methods (12:41).

//Static Block (22:22): A specialized block used to initialize static variables, which executes automatically when the class
// is first loaded.

//Final Keyword (27:17): Used to define constants. Once a variable, method, or class is marked as final, its value or behavior
// becomes fixed and cannot be changed or overridden.

//Main Method & String[] args (35:18): Explains why the main() method must be static so the JVM can execute it without creating an object.
// It also breaks down the String[] args parameter, which allows for configuration inputs when running a program from the terminal (39:49).
