public class Subwoofer extends Sounds{
    private String color;

    public Subwoofer(){
    }

    public Subwoofer(String color) {
        this.color = color;
    }

    public Subwoofer(String model, String color) {
        super(model);
        this.color = color;
    }

    public Subwoofer(int price, int year, String model, String color) {
        super(price, year, model);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
