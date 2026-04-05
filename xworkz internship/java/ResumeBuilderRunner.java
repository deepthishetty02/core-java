class ResumeBuilderRunner {
    public static void main(String[] args) {

        ResumeBuilder obj1 = new ResumeBuilder("Classic", "PDF", 2);
        obj1.display();

        ResumeBuilder obj2 = new ResumeBuilder("Modern", "DOC", 3);
        obj2.display();

        ResumeBuilder obj3 = new ResumeBuilder("Creative", "PDF", 1);
        obj3.display();

        ResumeBuilder obj4 = new ResumeBuilder("Professional", "DOC", 2);
        obj4.display();

        ResumeBuilder obj5 = new ResumeBuilder("Simple", "PDF", 1);
        obj5.display();

        ResumeBuilder obj6 = new ResumeBuilder("Elegant", "DOC", 3);
        obj6.display();

        ResumeBuilder obj7 = new ResumeBuilder("Minimal", "PDF", 2);
        obj7.display();

    }
}