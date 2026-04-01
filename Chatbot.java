class Chatbot {

    String botName;
    String language;
    int responses;

    public Chatbot() {
    }

    public Chatbot(String botName, String language, int responses) {
        this.botName = botName;
        this.language = language;
        this.responses = responses;
    }

    public void display() {
        System.out.println(botName);
        System.out.println(language);
        System.out.println(responses);
        System.out.println("-------------------");
    }
}