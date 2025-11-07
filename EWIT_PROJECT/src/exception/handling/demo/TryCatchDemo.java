package exception.handling.demo;

public class TryCatchDemo {

    public static void main(String[] args) {
        System.out.println("I am in the main method");
        int result;

        try {
            result = TryCatchExample.performDivision(12, 0); // will throw exception
            if (result != 0)
                System.out.println("Division is " + result);

            System.out.println("----------");

            result = TryCatchExample.performDivision(12, 3);
            if (result != 0)
                System.out.println("Division is " + result);

            System.out.println("-------------");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in TryCatchDemo: " + e.getMessage());

            System.out.println(TryCatchExample.performDivision(12f, 15f));
            System.out.println("-------------");
            System.out.println(TryCatchExample.performDivision(12f, 0f));
        }
    }
}
