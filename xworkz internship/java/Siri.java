class Siri {

    public static void main(String[] args) {

        System.out.println("Program Started");

        introduce();

        playSong("Shape of You", 3);

        String response = getResponse();
        System.out.println("Returned Value: " + response);

        System.out.println("Program Ended");
    }

    static void introduce() {
        System.out.println("Hello, I am Siri");
    }

    static void playSong(String songName, int duration) {
        System.out.println("Playing Song: " + songName);
        System.out.println("Duration: " + duration + " minutes");
    }

    static String getResponse() {
        String message = "Song Played Successfully";
        return message;
    }
}