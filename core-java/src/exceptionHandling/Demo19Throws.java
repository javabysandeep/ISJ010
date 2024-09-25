package exceptionHandling;

public class Demo19Throws {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
    }

    private static int divide(int number1, int number2) throws ArithmeticException {
        int division = number1 / number2;
        return division;
    }
}
