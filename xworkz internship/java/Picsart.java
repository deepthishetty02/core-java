class Picsart {

    String toolName;
    String effectType;
    int downloads;

    public Picsart() {
    }

    public Picsart(String toolName, String effectType, int downloads) {
        this.toolName = toolName;
        this.effectType = effectType;
        this.downloads = downloads;
    }

    public void display() {
        System.out.println(toolName);
        System.out.println(effectType);
        System.out.println(downloads);
        System.out.println("-------------------");
    }
}