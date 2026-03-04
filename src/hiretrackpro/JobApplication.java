package hiretrackpro;

import java.sql.SQLOutput;

public class JobApplication {

    // Method to print job details
    public static void printjobdetails(String company, String role, double salary) {
        System.out.println("Company: " + company);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }

    //Method to get job status
    public static String getJobStatus(double salary) {
        if (salary >= 100000) {
            return "Dream Job!";
        } else {
            return "negotiate salary";
        }
    }

    //Method to check if FAANG
    public static boolean isFAANG(String company) {
        return company.equals("Google") ||
                company.equals("Netflix") ||
                company.equals("Amazon") ||
                company.equals("Apple") ||
                company.equals("Meta") ;

    }

    public static void main(String[] args) {

        //using methods instead of repeating code
        printjobdetails("Google", "Software Engineer", 120000.0);
        System.out.println("Status: " +getJobStatus(120000.0));
        System.out.println("FAANG: " + isFAANG("Google"));
    }


}