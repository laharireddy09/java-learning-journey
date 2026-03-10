package oop;

public class EncapsulationDemo {

    private String companyName;
    private String role;
    private double salary;
    private boolean isRemote;

    //constructor
    public EncapsulationDemo(String companyName, String role, double salary, boolean isRemote) {
        this.companyName=companyName;
        this.role=role;
        setSalary(salary); //using setter in constructor
        this.isRemote=isRemote;
    }

    //Getters
    public String getCompanyName() {return companyName;}
    public String getRole(){return role;}
    public double getSalary(){return salary;}
    public boolean isRemote() { return isRemote; }

    // Setters with validation
    public void setCompanyName(String companyName) {
        if (!companyName.isEmpty()) {
            this.companyName = companyName;
        } else {
            System.out.println("Company name cannot be empty!");
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Must be positive.");
        }
    }

    public void printDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("Remote: " + isRemote);
    }

    public static void main(String[] args) {
        //creating object

        EncapsulationDemo job = new EncapsulationDemo("Googe", "Software engineer", 120000.0, true);

        job.printDetails();

        //using setter to update
        System.out.println("-----Updating salary");
        job.setSalary(150000.0);
        System.out.println("New Salary: " + job.getSalary());

        // Trying invalid values
        System.out.println("--- Testing validation ---");
        job.setSalary(-5000);
        job.setCompanyName("");
    }
}
