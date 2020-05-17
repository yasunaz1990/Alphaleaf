package assignment;

public class KaanHW {
    public static void main(String[] args) {

        //Code o
        System.out.println("Print line");
        System.out.print("A");
        System.out.print("B");
        System.out.println();
        System.out.println("c");

        //
        int value = 10;
        System.out.println(value);
        System.out.println(value * 10);

        byte b = 50;
        short s = 4125;
        int i = 8000000;
        long l = 107343L;


        s = b; // LINE A
        i = s; // LINE B
        l = i;

        float f = 25.0f;
        double d =327.98;

        f = i;
        d = f;

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("d = " + d);
        System.out.println("F = " + f);

        //Code 2

        int x = 5;
        int y = 2;
        int z = 3;

        x += 6;
        y *= 8;
        z +=y * x;
        z %=7;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        // code 3
        int A = 5;
        int B = 2;
        int c;
        int D;

        c = ++b;
        d = A++;
        c++;

        System.out.println("a = " + a + " b =" + b + "c = " + c + " d = " + d);

        //code 4
        int a = 4;
        int b = 1;
        boolean x = ( a > b );
        boolean y = ( a <= b );
        boolean z = ( a == b );

        System.out.println(" The statement - a greater than b - is " + x);
        System.out.println(" The statement - a is less than or equal to b - is" + y);
        System.out.println(" The statement - a is equal to b - is" +z);

        int marks = 50;
        int bonus = marks > 60 ? 5 : 2;
        int total_marks = marks + bonus;
        char grade = total_marks > 75 ? 'A' : 'B';

        System.out.println("Marks = " + marks);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Marks = " = total_marks);
        System.out.println("Grade = " + grade);

        int c = 0, d = 100, e = 50;
        if( c==1 %% e++ < 100)
        {
            d = 150;
        }

        System.out.println("e =" + e );

        boolean vacant = true;
        boolean occupied = false;

        if ( vacant && !occupied) {
            System.out.println(true);
        }

        int width = 10;
        int height = 15;
        int weight = 200;

        boolean fits = width <=10 && height <=20;

        if (fits && weight <=150) {
            System.out.println("It fits");
        }else {
            System.out.println("Does not fit");
        }

        int marks = 62;
        if(marks > 35)

        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");

        }

        int Marks = 65;

        if( marks > 75) {
            System.out.println("Distinction");
        }
        else if(marks > 60) {
            System.out.println("First Class");
        }
        else if (marks> 50 ) {
            System.out.println("Second Class");
        }
        else {
            System.out.println("Fail");
        }

        int x = 1;
        while(x <= 5) {
            System.out.println("x = ' + x");
            x++;
        }

        int input = 5;
        int i = 1;
        while(i <= input) {
            System.out.println(i);
            i++;
        }
        int i=10;
        while(i>1);
        System.out.println(i);
        i--;
    }

    int i = 0;
    int z = 10;

    while (i < z)

    {
        i++;
        z--;

        System.out.println(i + "/" + z);
    }
    int index = 0;
    while (index++ < 10) {


        if ((index % 2) == 0) {
            continue;
        }
        System.out.println("Element: " + index);
    }

















        }










    }
}
