class Addition {
    int num1;
    int num2;
    int sum;

    // Parameterized Constructor
    Addition(int a, int b) {
        num1 = 10;
        num2 = 20;
        sum = num1 + num2;
    }

    void display() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Creating object and passing values
        Addition obj = new Addition(10, 20);
        obj.display();
    }
}


