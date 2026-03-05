package hiretrackpro;

public class JobApplication {

    // Method to print job details
    public static void printjobdetails(String company, String role, double salary) {
        System.out.println("Company: " + company);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + salary);
        System.out.println("Status: " + getJobStatus(salary));
        System.out.println("FAANG: " + isFAANG(company));
        System.out.println("----------------------------");
    }

    // Method to get job status
    public static String getJobStatus(double salary) {
        if (salary >= 100000) {
            return "Dream Job!";
        } else {
            return "Negotiate salary";
        }
    }

    // Method to check if FAANG
    public static boolean isFAANG(String company) {
        return company.equals("Google") ||
                company.equals("Netflix") ||
                company.equals("Amazon") ||
                company.equals("Apple") ||
                company.equals("Meta");
    }

    public static void main(String[] args) {

        // Arrays to store multiple applications
        String[] companies = {"Google", "Amazon", "Meta", "Apple", "Netflix"};
        String[] roles = {"Software Engineer", "Data Engineer", "ML Engineer", "iOS Engineer", "Backend Engineer"};
        double[] salaries = {120000, 95000, 110000, 105000, 98000};

        // Loop through all applications
        System.out.println("===== HireTrack Pro - All Applications =====\n");
        for (int i = 0; i < companies.length; i++) {
            printjobdetails(companies[i], roles[i], salaries[i]);
        }
    }
}
