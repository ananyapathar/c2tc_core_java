package exception.handling.demo;

public class WithoutExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program without exception handling.");
        int x = 10, y = 0;
        int z = x / y; // This will cause an exception
        System.out.println("Division result: " + z);
    }
}
