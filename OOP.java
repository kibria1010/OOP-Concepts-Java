package oop;

/*
In Java, a class is a blueprint or template for creating objects. 
It defines the attributes (fields) and behaviors (methods) that the objects created from the class will have. Classes are fundamental in Java’s object-oriented programming (OOP) model, allowing developers to model real-world entities and their interactions in code.
- 
In Java, an object is an instance of a class. 
It represents a real-world entity with a specific state and behavior, created based on the blueprint defined by its class. 
*/
public class OOP {
    
    //attributes
    String s;
    
    // blocks
    {
        System.out.println("Top-Outer block");
        {
            System.out.println("Inner block");
        }
        System.out.println("down-outer block");
    }

    //Default constructor
    public OOP() { }

    //Overloading constructor
    public OOP(String s) {
        this.s = s;
    }
    
    
    
    // method
    public void testMethod() {
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new OOP();
        System.out.println("----------------");
        OOP object = new OOP("Kibria");
        object.testMethod();
        
    }
    
}
