package Operators;

public class BranchingDemo {

    public static void main(String[] args) {

        String choice = "A";

        if (choice == "A") {
            System.out.println("You have passed");
        } else if (choice == "B") {
            System.out.println("You did so so");
        } else if (choice == "C") {
            System.out.println("You have failed");
        } else {
            System.out.println("You did not study");
        }
    }
}
