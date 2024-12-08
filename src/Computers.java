public class Computers extends Electronics{
    private int ram;
    private String name;

    public Computers() {
    }

    public Computers(int ram, String name) {
        this.ram = ram;
        this.name = name;
    }

    public Computers(int price, int year, int ram, String name) {
        super(price, year);
        this.ram = ram;
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
