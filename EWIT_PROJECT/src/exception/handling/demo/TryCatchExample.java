package exception.handling.demo;

public class TryCatchExample {

    static int performDivision(int x, int y) {
        System.out.println("I am in performDivision(int, int) method");
        int z = 0;
        z = x / y; // may throw ArithmeticException
        return z;
    }

    static float performDivision(float a, float b) {
        System.out.println("I am in performDivision(float, float) method");
        float result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed (float version)");
        }
        return result;
    }
}
