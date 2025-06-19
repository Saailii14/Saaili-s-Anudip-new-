public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operations
        System.out.println("Addition: " + (a + b));    
        System.out.println("Subtraction: " + (a - b));    
        System.out.println("Multiplication: " + (a * b)); 
        System.out.println("Division: " + (a / b));       
        System.out.println("Modulus: " + (a % b)); 
        
        // Post-increment
        int x = 10;
        System.out.println(" increment, a: " + a);
        System.out.println("x++: " + (x++));                    
        System.out.println(" increment, a: " + x);   
        // Post-decrement
        System.out.println("x--: " + (x--));                    
        System.out.println(" decrement,a : " + x);  
           }
}