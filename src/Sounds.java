public class Sounds extends Electronics{
    private String model;

    public Sounds() {
    }

    public Sounds(String model) {
        this.model = model;
    }

    public Sounds(int price, int year, String model) {
        super(price, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
