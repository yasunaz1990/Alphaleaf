import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class m {

    public static void main(String[] args) {

        int[] numbers = {8, 9, 10, 24, 35};
        System.out.println( "this array has; " + numbers.length);
        numbers[1]= 27;
        numbers[4]= 100;
        System.out.println(Arrays.toString(numbers));


    }
}
