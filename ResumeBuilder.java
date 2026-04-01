class ResumeBuilder {

    String templateName;
    String formatType;
    int pages;

    public ResumeBuilder() {
    }

    public ResumeBuilder(String templateName, String formatType, int pages) {
        this.templateName = templateName;
        this.formatType = formatType;
        this.pages = pages;
    }

    public void display() {
        System.out.println(templateName);
        System.out.println(formatType);
        System.out.println(pages);
        System.out.println("-------------------");
    }
}