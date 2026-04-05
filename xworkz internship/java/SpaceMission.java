class SpaceMission{

    public static void main(String[] args) {

        String missionName;
        int launchYear;
        double missionBudget;
        char missionGrade;
        boolean isSuccessful;

        missionName = "Chandrayaan";
        launchYear = 2023;
        missionBudget = 750000000.75;
        missionGrade = 'A';
        isSuccessful = true;

        System.out.println("Mission: " + missionName + ", Year: " + launchYear +
                           ", Budget: " + missionBudget + ", Grade: " + missionGrade +
                           ", Success: " + isSuccessful);

        missionName = "Gaganyaan";
        launchYear = 2025;
        missionBudget = 950000000.50;
        missionGrade = 'B';
        isSuccessful = false;

        System.out.println("Updated -> " + missionName + " | " + launchYear + " | " +
                           missionBudget + " | " + missionGrade + " | " + isSuccessful);
    }
}