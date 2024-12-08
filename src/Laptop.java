public class Laptop extends Computers{
    private int batteryHours;

    public Laptop() {
    }

    public Laptop(int batteryHours) {
        this.batteryHours = batteryHours;
    }

    public Laptop(int ram, String name, int batteryHours) {
        super(ram, name);
        this.batteryHours = batteryHours;
    }

    public Laptop(int price, int year, int ram, String name, int batteryHours) {
        super(price, year, ram, name);
        this.batteryHours = batteryHours;
    }

    public int getBatteryHours() {
        return batteryHours;
    }

    public void setBatteryHours(int batteryHours) {
        this.batteryHours = batteryHours;
    }
}
