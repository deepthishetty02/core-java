class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        getCalculator();

        int num1 = 20;
        int num2 = 10;

        add(num1, num2);
        subtract(num1, num2);

        System.out.println("Multiplication Result:");
        int mulResult = multiply(num1, num2);
        System.out.println(mulResult);

        System.out.println("Division Result:");
        double divResult = divide(num1, num2);
        System.out.println(divResult);
    }

    static void getCalculator() {
        System.out.println("This is Simple Calculator...");
    }

    static void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    static void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    static double divide(int a, int b) {
        double result = (double)a / b;
        return result;
    }
}