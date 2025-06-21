// Parent class
class Person {
    void speak() {
        System.out.println("Person can speak.");
    }
}

// Child class
class Saaili extends Person {
    void study() {
        System.out.println("Saaili is studying Java.");
    }
}

// Main class
public class Singleinheritance {
    public static void main(String[] args) {
        Saaili s = new Saaili();
        s.speak();   // Inherited from Person
        s.study();   // Own method of Saaili
    }
}
