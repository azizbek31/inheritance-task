public class Electronics {
    private int price;
    private int year;

    public Electronics() {
    }

    public Electronics(int price, int year) {
        this.price = price;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
