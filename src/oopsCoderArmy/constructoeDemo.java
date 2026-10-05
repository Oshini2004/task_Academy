package oopsCoderArmy;

public class constructoeDemo {
    public static void main(String[] args) {
        Studen s1 = new Studen();
        // Student s2 = new Student("Aditya");
        // Student s3 = new Student("Rohit", 28);
        // Student s4 = new Student("Rohan", 30, 103);
        // Student s5 = new Student("Mohan", 31, 104, "IIT Bombay");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}
// Constructor chaining
class Studen{
    String name;
    int age;
    int rollNumber;
    String college;

    Studen() {
        this("Unknown");
        System.out.println("I am in first constructor");
    }

    Studen(String name) {
        this(name, 0);
        System.out.println("I am in second constructor");
    }

    Studen(String name, int age) {
        this(name, age, 0);
        System.out.println("I am in third constructor");
    }

    Studen(String name, int age, int rollNumber) {
        this(name, age, rollNumber, "Unknown");
        System.out.println("I am in fourth constructor");
    }

    Studen(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

        System.out.println("I am in fifth constructor");
    }

    void markAttendance() {
        System.out.println("Attendance marked for student " + name);
    }
}
//Key Topics Covered:
//Introduction to Default Values (0:17 - 11:26): Explains how Java automatically assigns default values (e.g., null for objects, 0 for integers) to instance variables when they are not explicitly initialized.
//Constructors Fundamentals (11:26 - 20:21): Defines constructors as special methods used to initialize objects. It covers the core rules: they must have the same name as the class, have no return type, and are called automatically during object creation.

//Types of Constructors:
//Default Constructor (20:21 - 22:35): Explains how the compiler generates an implicit, empty constructor if no other constructor is defined by the developer.
//Parameterized Constructor (22:35 - 26:39): Shows how to pass arguments to initialize objects with specific data.

//Advanced Concepts:
//Constructor Overloading (26:39 - 32:28): Demonstrates how to define multiple constructors with different parameter signatures.
//The this Keyword (32:28 - 36:26): Explains its use in referring to the current object and resolving ambiguity between instance variables and parameters.
//Constructor Chaining (36:26 - 55:04): Shows how one constructor can call another using this() to reuse logic and reduce code redundancy.
