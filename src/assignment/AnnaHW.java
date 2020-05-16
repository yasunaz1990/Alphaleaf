package assignment;

public class AnnaHW {
    public static void main(String[] args) {

        //Code 0 print() and println() to the terminal display

        //System.out.println("Print line");
        //System.out.println("A");
       // System.out.println("B");
       // System.out.println();
       // System.out.println("C");

// Print ints directly, no conversion needed.
        //int value = 10;
        //System.out.println(value);
        //System.out.println(value * 10);

        //Code 1 Variable Creation, Data Assignments, Printing to the screen

        //byte b = 50;
        short s = 4125;
        int i = 800000;
        long l = 10734L;

        //s = b;      //LINE A
        i = s;      //LINE B
        l = i;      //LINE C

        float f = 25.0f;
        //double d = 327.98;

        f = i;
        //d = f;

        //System.out.println("b = " + b );
        //System.out.println("s = " + s) ;
        //System.out.println("i = " + i );
       // System.out.println("l = " + l );
        //System.out.println("d = " + d );
        //System.out.println("f = " + f );
 // I am not sure what is happening here...

        //Code 2 Arithmetic Operators, Printing to the screen
        //int x = 5;
        //int y = 2;
        //int z = 3;

       // x += 6;        //LINE A
        //y *= 8;        //LINE B
        //z += y * x;    //LINE C
       // z %= 7;        //LINE D

        //System.out.println("x = " + x);
        //System.out.println("y = " +y);
        //System.out.println("z = " + z);


        //Code 3 Pre and Post Increment
        //int a = 5;
        //int b = 2;
       // int c;
       // int d;
       // c = ++b;      //LINE A
       // d = a++;      //LINE B
       // c++;          //LINE C

        //System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
        //I do not understand the answers here...

        //Code 4 Relational Operators
        int a = 4;
        int b = 1;
        boolean x = ( a > b );
        boolean y = ( a <= b );
        boolean z = ( a ==b );

        System.out.println( "The statement - a greater than b - is " + x );
        System.out.println( "The statement - a is less than or equal to b - is " + y);
        System.out.println( "The statement - a is equal to b - is " +z );
    }

}
