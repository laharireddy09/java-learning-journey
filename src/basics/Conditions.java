package basics;

public class Conditions {
    public static void main(String[] args) {
        String company = "Google";
        double salary = 120000.0;
        boolean isRemote = true;

        if(salary >= 100000) {
            System.out.println("Dream Job!");
        } else {
            System.out.println("Negotiate Salary");
        }

        if (company.equals("Google") || company.equals("Amazon")) {
            System.out.println("FAANG Target");
        } else if (company.equals("tartup")) {
            System.out.println("high risk High reward");
        } else {
            System.out.println("Good Opportunity");
        }

        if (isRemote == true && salary > 80000) {
            System.out.println("perfect job");
        }
    }
}
