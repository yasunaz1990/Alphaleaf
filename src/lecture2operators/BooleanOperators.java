package lecture2operators;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class BooleanOperators {

    public static void main(String[] args) {

       // boolean[] logic1 = {false, true, true, false, true};
       // System.out.println(Arrays.toString(logic1));

       // boolean[] logic2 = new boolean[5];
       // logic2[3] = true;
       // System.out.println(Arrays.toString(logic2));

        int[] numbers = {102, 33, 444, 675, 984, 890, 764, 353};

        System.out.println(     numbers.length   );     // how many elements I have in array
        System.out.println(     numbers.length - 1 );      // index of last element in the array
        System.out.println(     numbers.length - 2 );
        System.out.println(     numbers.length - 3 );
        numbers[numbers.length - 2 ] = 1900;
        numbers[numbers.length - numbers.length] = 1900;
        System.out.println(Arrays.toString(numbers));

        }
}