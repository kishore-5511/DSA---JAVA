package DSA.OOPS;

public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Single level inheritance

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived Class or Sub Class  
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}