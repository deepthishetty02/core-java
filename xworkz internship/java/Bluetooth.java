class Bluetooth {

    String deviceName;
    String version;
    int range;

    public Bluetooth() {
    }

    public Bluetooth(String deviceName, String version, int range) {
        this.deviceName = deviceName;
        this.version = version;
        this.range = range;
    }

    public void display() {
        System.out.println(deviceName);
        System.out.println(version);
        System.out.println(range);
        System.out.println("-------------------");
    }
}