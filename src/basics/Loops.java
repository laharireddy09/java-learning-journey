package basics;

public class Loops {
    public static void main(String[] args){

        //for loop
        System.out.println("----For Loop------");
        for(int i = 1; i <=5; i++) {
            System.out.println("Application number:  " + i);
        }

        //while loop
        System.out.println("---While Loop---");
        int i=1;
        while (i<=5) {
            System.out.println("Applciation numbe:  " + i );
            i++;
        }

        //do-while loop
        System.out.println("--Do-while loop ----");
        int j=1;
        do {
            System.out.println("Application Number:  " + j);
            j++;
        } while(j<=5);
    }
}
