package basics;

public class Arrays {

    public static void main(String[] args) {

        //Declare and initialize
        String[] companies = {"Google", "Amazon", "Meta", "Apple", "Netflix"};
        double[] salaries = {120000, 95000, 110000, 105000, 98000};

        //Access by index
        System.out.println("First company: " + companies[0]);
        System.out.println("Last company: " + companies[4]);

        //Array length
        System.out.println("Total applications: " + companies.length);

        //Loop through arrays
        System.out.println("\n--- All Applications ---");
        for(int i = 0; i < companies.length; i++){
            System.out.println(companies[i] + " - $"+ salaries[i]);
        }

        //update an element
        salaries[1]=100000;//negotiated!
        System.out.println("\nUpdated Amazon salary: $s" + salaries[1]);
    }
}
