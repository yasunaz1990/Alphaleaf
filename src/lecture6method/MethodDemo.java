package lecture6method;

public class MethodDemo {
    
    // Main methodm only place CPU execute
    public static void main( String[] args ) {

        for(int i =0; i < 10; i++) {
            boolean ret = i < 10;
            printRandomeNumber();
        }
    }

    // method that generate randome number
    public static void printRandomeNumber() {
        System.out.println(  Math.random()  );
    }
}
