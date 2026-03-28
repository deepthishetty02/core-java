class Robot {

    public static void main(String[] args) {

        System.out.println("Hi Robot");
        getRobot();

        System.out.println("I have two numbers, add and print");
        int a = 30;
        int b = 40;
        String result = "DONE";

        addNumbers(a, b, result);

        System.out.println("What is the battery capacity?");
        long battery = getBatteryCapacity();
        System.out.println(battery);
    }

    static void getRobot() {
        System.out.println("Hi this is Robot...");
    }

    static void addNumbers(int num1, int num2, String message) {
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println(message);
    }

    static long getBatteryCapacity() {
        long capacity = 5000;
        return capacity;
    }
}