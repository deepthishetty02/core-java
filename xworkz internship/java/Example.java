class Example{

    public static void main(String[] args) {

        System.out.println("Program example");

        message();

        add(10, 20);

        int value = getNumber();
        System.out.println(value);
        
    }

    static void message() {
        System.out.println("This is void non-parameter method");
    }

    static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static int getNumber() {
        int num = 50;
        return num;
    }
}