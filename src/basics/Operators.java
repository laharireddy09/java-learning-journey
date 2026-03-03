package basics;

public class Operators {

    public static void main(String[] args){
        int a=10, b=3;

        //arithmetic
        System.out.println("Add: " + (a+b));
        System.out.println(("Subtract: " + (a-b)));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Comparison
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical
        System.out.println("a>5 AND b>5: " + (a > 5 && b > 5));
        System.out.println("a>5 OR b>5: " + (a > 5 || b > 5));
    }
}
