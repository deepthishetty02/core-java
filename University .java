class University {

    static String name = "VTU";
    static int campuses = 5;
    static double ranking = 8.5;
    static boolean autonomous = true;
    static char grade = 'A';

    public static void main(String[] args) {

        String name = "MIT";
        int campuses = 2;
        double ranking = 9.2;
        boolean autonomous = false;
        char grade = 'B';

        System.out.println("---- Static Variables ----");
        System.out.println("Name: " + University.name);
        System.out.println("Campuses: " + University.campuses);
        System.out.println("Ranking: " + University.ranking);
        System.out.println("Autonomous: " + University.autonomous);
        System.out.println("Grade: " + University.grade);

        System.out.println("---- Local Variables ----");
        System.out.println("Name: " + name);
        System.out.println("Campuses: " + campuses);
        System.out.println("Ranking: " + ranking);
        System.out.println("Autonomous: " + autonomous);
        System.out.println("Grade: " + grade);
    }
}