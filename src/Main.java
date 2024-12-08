
public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("John", 10, 100000);
        Xirurg xirurg = new Xirurg("Tom", 7, 70000, 20, 30);
        Lor lor = new Lor("Bob", 9, 80000, 40, 40);

        doctor.treat();
        xirurg.performSurgery();
        lor.operate();
    }
}