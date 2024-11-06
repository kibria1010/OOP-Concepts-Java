package oop;

/**
 * An interface in Java is a blueprint of a behavior. 
 * A Java interface contains static constants and abstract methods.
 */

public class Interface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();   // Output: Duck flies.
        duck.swim();  // Output: Duck swims.
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies.");
    }

    public void swim() {
        System.out.println("Duck swims.");
    }
}
