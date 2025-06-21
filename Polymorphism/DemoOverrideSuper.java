package Polymorphism;

class Gadget {
    void turnOn() {
        System.out.println("Gadget is turning on");
    }
}

class Smartphone extends Gadget {
    void turnOn() {
        super.turnOn();
        System.out.println("Smartphone is turning on with fingerprint");
    }
}

public class DemoOverrideSuper {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.turnOn();
    }
}
