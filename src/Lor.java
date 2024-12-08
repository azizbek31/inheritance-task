public class Lor extends Doctor{

    int earOperations;
    int noseOperations;

    public Lor(String name, int yearsOfExperience, int salary, int earOperations, int noseOperations) {
        super(name, yearsOfExperience, salary);
        this.earOperations = earOperations;
        this.noseOperations = noseOperations;
    }

    public Lor(int earOperations, int noseOperations) {
        this.earOperations = earOperations;
        this.noseOperations = noseOperations;
    }

    public Lor() {
    }

    public int getEarOperations() {
        return earOperations;
    }

    public void setEarOperations(int earOperations) {
        this.earOperations = earOperations;
    }

    public int getNoseOperations() {
        return noseOperations;
    }

    public void setNoseOperations(int noseOperations) {
        this.noseOperations = noseOperations;
    }

    public void operate(){
        System.out.println(getName() + " is a surgeon. He has " + getYearsOfExperience() + " years of experience in this job." +
                "His salary is $" + getSalary() + ". So far he's performed " + getEarOperations() + " ear operations and " +
                getNoseOperations() + " nose operations.");
    }
}
