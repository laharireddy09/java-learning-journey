package hiretrackpro;

public class JobApplication {
    public static void main(String[] args) {

        String companyName = "Google";
        String role = "Software Engineer";
        double expectedSalary = 120000.0;
        boolean isRemote = true;
        int appliedYear = 2025;

        System.out.println("Company: " + companyName);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + expectedSalary);

        if (expectedSalary >= 100000) {
            System.out.println("Status: Dream Job!");
        } else {
            System.out.println("Status: Negotiate salary");
        }

        if (companyName.equals("Google") || companyName.equals("Amazon")) {
            System.out.println("Type: FAANG Target!");
        } else {
            System.out.println("Type: Good opportunity");
        }

        if (isRemote && expectedSalary > 80000) {
            System.out.println("Verdict: Perfect Job!");
        }

        String[] companies = {"Google", "Amazon", "Microsoft", "Meta", "Apple"};

        System.out.println("-----My First Job Application-----");
        for (int i = 0; i < companies.length; i++){
            System.out.println("Application " + (i+1) + ": " +companies[i]);
        }
    }
}