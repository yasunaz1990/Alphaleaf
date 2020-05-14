package operators;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class BranchingDemo {
    // if statement
    // if-else statement
    // chaining if-else statement

    public static void main(String[] args) {

        //System.out.println("Select a grade [A, B, C]: ");
        //Scanner keyboard = new Scanner(System.in);
        String choice = "B";

        if (choice == "A") {
            System.out.println("You have passed");
        } else if (choice == "B") {
            System.out.println("You did so so");
        } else if (choice == "C") {
            System.out.println("You have failed");
        } else {
            System.out.println("This is the end of it!");
        }

        System.out.println( true && true);
        System.out.println( false && true);
        System.out.println( true & false);
        System.out.println( false && false);
        System.out.println(12 % 2);
        // Looping

        for(int i=0; i<=13; i++)
            System.out.println(i+ ":\t=\t" + "Apple is the best");
    }
}
