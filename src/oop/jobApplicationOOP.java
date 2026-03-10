package oop;

public class jobApplicationOOP {

    // Fields (instance variables)
    private String applicantName;
    private String position;
    private String company;
    private int yearsOfExperience;
    private String status;

    // Constructor
    public jobApplicationOOP(String applicantName, String position, String company, int yearsOfExperience) {
        this.applicantName = applicantName;
        this.position = position;
        this.company = company;
        this.yearsOfExperience = yearsOfExperience;
        this.status = "Pending";
    }

    // Methods
    public void submitApplication() {
        System.out.println(applicantName + " submitted an application for " + position + " at " + company);
        this.status = "Submitted";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Status updated to: " + status);
    }

    public boolean isExperienced() {
        return yearsOfExperience >= 3;
    }

    public void displayDetails() {
        System.out.println("--- Job Application ---");
        System.out.println("Applicant : " + applicantName);
        System.out.println("Position  : " + position);
        System.out.println("Company   : " + company);
        System.out.println("Experience: " + yearsOfExperience + " years");
        System.out.println("Status    : " + status);
        System.out.println("Experienced: " + (isExperienced() ? "Yes" : "No"));
    }

    // Main method to test
    public static void main(String[] args) {
        jobApplicationOOP app1 = new jobApplicationOOP("Alice", "Software Engineer", "Google", 5);
        app1.submitApplication();
        app1.displayDetails();

        System.out.println();

        jobApplicationOOP app2 = new jobApplicationOOP("Bob", "Intern", "Startup Inc", 0);
        app2.submitApplication();
        app2.updateStatus("Rejected");
        app2.displayDetails();
    }
}
