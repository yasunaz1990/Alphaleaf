package assignment;

public class NadiaHW {

    public static void main (String[] args) {
//
//
//
//    // Code 0: print( ) and println( ) to the terminal display
//
//        System.out.println("Print line");
//        System.out.print("A");
//        System.out.print("B");
//        System.out.println();
//        System.out.println("C");
//
//        //Print ins directly, no conversion needed.
//
//        int value = 10;
//
//        System.out.println(value);
//        System.out.println(value * 10);
//
//
//
//
//    // Code 1: Variable Creation, Data Assignments, Printing to the screen
//
//        byte b = 50;
//        short s = 4125;
//        int i  = 800000;
//        long l = 107343L;
//
//        s = b;      // LINE A
//        i = s;      // LINE B
//        l = i;      // LINE C
//
//    float f = 25.0f;
//    double d = 327.98;
//
//    f = i;
//    d = f;
//
//    System.out.println("b = " + b );
//    System.out.println("s = " + s );
//    System.out.println("i = " + i );
//    System.out.println("l = " + l );
//    System.out.println("d = " + d );
//    System.out.println("f = " + f );
//
//
//
//
//    // Code 2: Arithmetic Operators, Printing to the screen
//
//        int x = 5;
//        int y = 2;
//        int z = 3;
//
//        x += 6;         // LINE A
//        y += 8;         // LINE B
//        z += y * x;     // LINE C
//        z %= 7;         // LINE D
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//
//
//
//
//       // Code 3:   Pre and Post Increment
//
//        int a = 5;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;       // LINE A
//        d = a++;       // LINE B
//        c++;           // LINE C
//
//        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
//
//
//
//
//
//        // Code 4:   Relational Operators
//
//        int a = 4;
//        int b = 1;
//        boolean x = ( a > b );
//        boolean y = ( a <= b );
//        boolean z = ( a == b );
//
//        System.out.println(" The statement - a greater than b - is " + x);
//        System.out.println(" The statement - a is less than or equal to b - is " + y);
//        System.out.println(" The statement - a is equal to b - is " + z);
//
//
//
//
//
//        // Code 5:  Conditional Assignment
//
//        int marks = 50;
//        int bonus = marks > 60 ? 5 : 2;
//        int total_marks = marks + bonus;
//        char grade = total_marks > 75 ? 'A' : 'B';
//
//        System.out.println("Marks = " + marks);
//        System.out.println("Bonus = " + bonus);
//        System.out.println("Total Marks = " + total_marks);
//        System.out.println("Grade = " + grade);
//
//
//
//
//
//        // Code 6: If statement with boolean expression part 1
//
//        int c = 0, d = 100, e = 50;         // LINE A
//        if( c == 1 && e++ < 100 )
//        {
//            d = 150;
//        }
//        System.out.println("e = " + e);
//
//
//
//
//
//        // Code 7:  If statement with boolean expression part 2
//
//        boolean vacant = true;
//        boolean occupied = false;
//
//        // Test boolean variables.
//        if (vacant && !occupied) {
//            System.out.println(true);
//        }
//
//
//
//
//
//
//        // Code 8:  If statement with boolean expression part 3
//
//        int width = 10;
//        int height = 15;
//        int weight = 200;
//
//        // Use a boolean to store computed result.
//        boolean fits = width <= 10 && height <= 20;
//
//        // We can use the boolean, not a complex expression.
//        if (fits && weight <= 150) {
//            System.out.println("it fits");
//        } else {
//            System.out.println("Does not fit");
//        }
//
//
//
//
//
//
//        // Code 9: If-else statement
//
//        int marks = 62;
//        if(marks > 35)                          // LINE A
//        {
//            System.out.println("Pass");         // LINE B
//        }
//        else
//            {
//            System.out.println("Fail");         // LINE C
//
//        }
//
//
//
//
//       // Code 10: Chaining if-else statement
//
//        int marks = 65;
//
//        if( marks > 75 )                               // CONDITION A
//        {
//            System.out.println("Distinction");         // LINE A
//        }
//        else if( marks > 60 )                          // CONDITION B
//        {
//            System.out.println("First Class");         // LINE B
//        }
//        else if( marks > 50 )                          // CONDITION C
//        {
//            System.out.println("Second Class");        // LINE C
//        }
//        else {
//            System.out.println("Fail");                // LINE D
//        }
//
//
//
//
//
//
//       // Code 11: While loop part 1
//
//        int x = 1;
//        while( x <= 5  )                    // LINE A
//        {
//            System.out.println("x = "+ x);
//            x++;
//        }
//
//
//
//
//
//        // Code 12:  While loop part 2
//
//        int input = 5;
//        int i = 1;
//        while(i <= input) {
//
//            System.out.println(i);
//            i++;
//        }
//
//
//
//
//
//        // Code 12:  While loop part 3, counting down
//
//        int i=10;
//        while(i>l) {
//            System.out.println(i);
//            i--;
//        }
//
//
//
//
//       // Code 13:  While loop part 4
//
//        int i = 0;
//        int z = 10;
//
//        // Loop with two variables.
//        while (i < z) {
//            i++;
//            z--;
//
//            // Display the values.
//            System.out.println(i + "/" + z);
//        }
//
//
//
//        // Code 14:  While loop part 5, usage of infinite loop
//
//
//
//        //Code 15:  While loop part 6
//
//        int index = 0;
//        // use post increment in while-loop expression.
//        while (index++ < 10) {
//
//            // Continue if even number.
//            if ((index % 2) == 0) {
//                continue;
//            }
//            System.out.println("Element: " + index);
        }




    }
