class main1 {
    // First interface
interface Dancer {
    void dance();
}

// Second interface
interface Singer {
    void sing();
}

// Class implementing both interfaces
class Saaili implements Dancer, Singer {
    public void dance() {
        System.out.println("Saaili can dance.");
    }

    public void sing() {
        System.out.println("Saaili can sing.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Saaili s = new Saaili();
        s.dance();
        s.sing();
    }
}

}
