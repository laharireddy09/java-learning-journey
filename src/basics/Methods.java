package basics;

import java.security.PublicKey;

public class Methods {
    //No input, no return
    public static void printWelcome(){
        System.out.println("welcome to HireTrack Pro!");
    }

    //has input, no return
    public static void printCompany(String companyName){
        System.out.println("Applying to: " + companyName);
    }

    //No input, has return
    public static String getJobStatus(double salary) {
        if(salary >= 100000) {
            return "Dream Job!";
        } else {
            return "Negotiate salary";
        }
    }
    //Has input, has return

    public static double calculateBonus(double salary) {
        return salary * 0.10;
    }

    public static void main(String[] args){
        //calling Methods

        printWelcome();
        printCompany("Google");
        printCompany("Amazon");
        printCompany("Microsoft");

        String status = getJobStatus((120000));
        System.out.println("Status: " + status);

        double bonus = calculateBonus(120000);
        System.out.println("Bonus: " +bonus);
    }
}
