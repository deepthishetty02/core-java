class YouTubeRunner {
    public static void main(String[] args) {

        YouTube obj1 = new YouTube("TechWorld", "Technology", 5000, 1111111111L, true);
        obj1.display();

        YouTube obj2 = new YouTube("FoodieFun", "Cooking", 2300, 2222222222L, false);
        obj2.display();

        YouTube obj3 = new YouTube("TravelVlogs", "Travel", 4200, 3333333333L, true);
        obj3.display();

        YouTube obj4 = new YouTube("StudyZone", "Education", 3100, 4444444444L, false);
        obj4.display();

        YouTube obj5 = new YouTube("GamingPro", "Gaming", 7800, 5555555555L, true);
        obj5.display();

        YouTube obj6 = new YouTube("FitnessHub", "Fitness", 2600, 6666666666L, false);
        obj6.display();

        YouTube obj7 = new YouTube("MusicBeats", "Music", 9000, 7777777777L, true);
        obj7.display();

    }
}