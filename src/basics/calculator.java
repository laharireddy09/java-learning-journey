package basics;
import java.util.Scanner;

public class calculator {
    public static int calculate(int a, int b, char operator){
       if(operator=='+'){
           return a+b;
       } else if (operator=='-'){
           return a-b;
       } else if (operator=='*') {
           return a*b;
       } else if (operator=='/') {
           if(b==0){
               System.out.println("Error: cannot divide by zero");
               return 0;
           }
           return a / b;

       } else {
           System.out.println("Invalid operator");
           return 0;
       }

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number: ");
        int a=scanner.nextInt();

        System.out.println("enter second number: ");
        int b = scanner.nextInt();

        System.out.println("enter operator(+, -, *, /");
        char operator = scanner.next().charAt(0);

        int result = calculate(a,b,operator);
        System.out.println("Result: " +result);
    }

}
