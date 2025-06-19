// First interface
interface Writer {
    void write();
}
// Second interface
interface Reader {
    void read();
}
// Class implementing both interfaces
class Saailii implements Writer, Reader {
    public void write() {
        System.out.println("Saailii is writing Java code.");
    }

    public void read() {
        System.out.println("Saailii is reading Java notes.");
    }
}
// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Saailii s = new Saailii();
        s.write();
        s.read();
    }
}