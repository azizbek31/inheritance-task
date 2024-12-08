public class Xirurg extends Doctor{

    private int cancerOperations;
    private int brainOperations;

    public Xirurg(String name, int yearsOfExperience, int salary, int cancerOperations, int brainOperations) {
        super(name, yearsOfExperience, salary);
        this.cancerOperations = cancerOperations;
        this.brainOperations = brainOperations;
    }

    public Xirurg(int cancerOperations, int brainOperations) {
        this.cancerOperations = cancerOperations;
        this.brainOperations = brainOperations;
    }

    public Xirurg() {

    }

    public int getCancerOperations() {
        return cancerOperations;
    }

    public void setCancerOperations(int cancerOperations) {
        this.cancerOperations = cancerOperations;
    }

    public int getBrainOperations() {
        return brainOperations;
    }

    public void setBrainOperations(int brainOperations) {
        this.brainOperations = brainOperations;
    }

    public void performSurgery(){
        System.out.println(getName() + " is a surgeon. He has " + getYearsOfExperience() + " years of experience in this job." +
                "His salary is $" + getSalary() + ". So far he's performed " + getCancerOperations() + " cancer operations and " +
                getBrainOperations() + " brain operations.");
    }
}
