public class Recursion {

    // Recursive function to find factorial
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(10);
        System.out.println("Factorial of 10 is: " + result);
    }
}