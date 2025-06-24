class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Adddiv {
    public static void main(String[] args) {
        Calculator saailiCalc = new Calculator();

        int a = 10, b = 2;

        System.out.println("Saaili's Add: " + saailiCalc.add(a, b));
        System.out.println("Saaili's Subtract: " + saailiCalc.subtract(a, b));
        System.out.println("Saaili's Multiply: " + saailiCalc.multiply(a, b));
        System.out.println("Saaili's Divide: " + saailiCalc.divide(a, b));
    }
}
