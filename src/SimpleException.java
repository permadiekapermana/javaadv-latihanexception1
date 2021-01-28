public class SimpleException {
    public static void main(String[] args) {
        try {
            int x = 15, y = 0;
            int z = x/y; // Tidak dapat dibagi dengan 0
            System.out.println ("Result = " + z);
        }
        catch(ArithmeticException e) {
            System.out.println (e);
        }
        System.out.println("After exception.");

    }
}