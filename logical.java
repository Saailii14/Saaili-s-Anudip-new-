public class logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical AND (&&)
        System.out.println((a < b) && (b > 15));

        // Logical OR (||)
        System.out.println((a > b) || (b == 20));

        // Logical NOT (!)
        boolean result = (a > b); 
        System.out.println(!result); 
}

}
