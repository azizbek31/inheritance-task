public class Loudspeaker extends Sounds{
    private int size;

    public Loudspeaker(){
    }

    public Loudspeaker(int size) {
        this.size = size;
    }

    public Loudspeaker(String model, int size) {
        super(model);
        this.size = size;
    }

    public Loudspeaker(int price, int year, String model, int size) {
        super(price, year, model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
