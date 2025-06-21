package Polymorphism;

class Animal {
    void sound() {
        System.out.println("\nAnimal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound(); // Calls Dog's overridden method
    }
}