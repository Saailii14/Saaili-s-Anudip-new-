// Parent class
class Person {
    void speak() {
        System.out.println("Person can speak.");
    }
}

// First child class
class Saaili extends Person {
    void dance() {
        System.out.println("Saaili can dance.");
    }
}

// Second child class
class Tanu extends Person {
    void sing() {
        System.out.println("Tanu can sing.");
    }
}

// Main class
public class Hierarchicalinheritance{
    public static void main(String[] args) {
        Saaili s = new Saaili();
        s.speak(); 
        s.dance();  

        Tanu t = new Tanu();
        t.speak(); 
        t.sing();   
    }
}
