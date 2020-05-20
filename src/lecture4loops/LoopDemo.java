package lecture4loops;

public class LoopDemo {

    // main method where CPU reads
    public static void main(String[] args) {

        // Looping
        //  1. While loop
        //  2. Do-While loop
        //  3. For loop

        // while loop
        // repeatedly executes a block of code as long as
        // the "condition" is TRUE


        // compute the larges power of 2
        // less than or equal to the n

        // get the sum of numbers 32 to 1000
        // 32 + 33 + 34 +........999 + 1000
        int sum = 0;
        for(int i = 32; i <= 1000; i++) {
            sum += i;

            if (i % 2 == 0) {
                continue;
            }

        }
        System.out.println("i");
            }
        }

        System.out.println(sum);


    }
}
