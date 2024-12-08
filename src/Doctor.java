public class Doctor {
    private String name;
    private int yearsOfExperience;
    private int salary;

    public Doctor(String name, int yearsOfExperience, int salary) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public Doctor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void treat(){
        System.out.println(getName() + " is a doctor. He has " + getYearsOfExperience() + " years of experience in this job." +
                "His salary is $" + getSalary() + ".");
    }
}
