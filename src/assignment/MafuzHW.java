package assignment;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.logging.XMLFormatter;

public class MafuzHW {

    public static void main(String[] args) {

        // Code 0 print() and println() to the terminal display
        System.out.println("Print line");
        System.out.println("A");
        System.out.println("B");
        System.out.println();
        System.out.println("C");

        //Print ints directly, no conversion needed.
        int value = 10;
        System.out.println(value);
        System.out.println(value * 10);

        // Code 1: Variable Creation, Data Assignments, Printing to the screen
        byte b = 50;
        short s = 4125;
        int i = 800000;
        long l = 10734L;

        s = b;   //LINE A
        i = s;   //LINE B
        l = i;   //LINE C

        float f = 25.0f;
        double d = 327.98;

        f = i;
        d = f;

        System.out.println("b = " + b );
        System.out.println("s = " + s )
        System.out.println("i = " + i );
        System.out.println("l = l" + l );
        System.out.println("d = " + d );
        System.out.println("f = " + f);

        // Code 2: Arithmetic Operators, Printing to the screen

        int x = 5;
        int y = 2;
        int z = 3;

        x += 6;     // LINE A
        y *= 8;     // LINE B
        z += y * x;     //LINE C
        z %= 7;     //LINE D

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        //Code 3: Pre and Post Increment

        int a = 5;
        int b = 2;
        int c;
        int d;

        c = ++b;    // LINE A
        d = a++;    // LINE B
        c++;      // LINE C

        System.out.println("a = " + a + " b = " + b + " c " + d);

        //Code 4: Relational Operators

        int a = 4;
        int b = 1;
        boolean x = ( a > b );
        boolean y = (a <=b );
        boolean z = (a == b );

        System.out.println(" The statement - a greater than b - is " + x);
        System.out.println(" The statement - a is less than or equal to b - is " + y);
        System.out.println(" The statement - a is equal to b - is " + z);

        //Code 5: Conditional Assignment

        int marks = 50;
        int bonus = marks > 60 ? 5 : 2;
        int total_marks = marks + bonus;
        char grade = total_marks > 75 ? 'A' : 'B';

        System.out.println("Marks = " + marks);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Marks = " + total_marks);
        System.out.println("Grade = " + grade);

        //Code 6: If statement with boolean expression part 1

        int c = 0, d = 100, e = 50;     // LINE A
        if ( c== 1 && e++ )
        {
            d = 150;
        }
        System.out.println("e = " + e);

        //Code 7: If statement with boolean expression part 2

        boolean vacant = true;
        boolean occupied = false;

        // Test boolean varibles.
        if (vacant && !occupied) {
            System.out.println(true);
        }

        //Code 8: If statement with boolean expression part 3
        int width = 10;
        int height = 15;
        int weight = 200;

        // Use a boolean to store computed result
        boolean fits = width <= 10 && height <= 20;

        // We can use the boolean, not a complex expression
        if (fits && weight <= 150) {
            System.out.println("It fits");
        } else {
            System.out.println("Does not fit");
        }

        //Code 9: If-else statement
        int marks = 62;
        if (marks > 35)  //LINE A
        {
            System.out.println("Pass");  //LINE B
        }
        else
        {
            System.out.println("Fail");    // LINE C
        }
    }
}
