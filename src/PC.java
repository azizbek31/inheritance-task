public class PC extends Computers{
    private int numberOfMonitors;

    public PC() {
    }

    public PC(int numberOfMonitors) {
        this.numberOfMonitors = numberOfMonitors;
    }

    public PC(int ram, String name, int numberOfMonitors) {
        super(ram, name);
        this.numberOfMonitors = numberOfMonitors;
    }

    public PC(int price, int year, int ram, String name, int numberOfMonitors) {
        super(price, year, ram, name);
        this.numberOfMonitors = numberOfMonitors;
    }

    public int getNumberOfMonitors() {
        return numberOfMonitors;
    }

    public void setNumberOfMonitors(int numberOfMonitors) {
        this.numberOfMonitors = numberOfMonitors;
    }
}
