package lecture3branching;

public class BranchingDemo {
    // if statement
    // if-else statement
    // chaining if-else statement
    public static void main(String[] args) {

//        System.out.print("Select a grade [ A, B, C]: ");
//        Scanner keyboard = new Scanner(System.in);
//        String choice = keyboard.nextLine();

        String choice = "A";

        if (choice == "A") {
            System.out.println("You have passed");
        } else if (choice == "B") {
            System.out.println("You did so so ");
        } else if (choice == "C") {
            System.out.println("You have failed");
        } else {
            System.out.println("You did not read the instructions");
        }

        System.out.println("the is the end of it!!!!");

    }//end::main
}





