import java.util.Arrays;

public class PracticeMay16 {
    // CPU will execute code inside
    public static void main(String[] args) {

        // Print something to terminal
        //System.out.print(65.7);
        //System.out.println(true);

//        System.out.print(9);
//        System.out.print("\n");
//        System.out.print(9);
//        System.out.print("\n");
//        System.out.print("\n");
//        System.out.print(10);
//        System.out.print("\n");

//    int cats = 10;
//    double money = (89.98);
//    String grade = ("F");
//    String text = ("yo bro~!");
        //"I want to say today is not cold"

//
//        System.out.println(cats);
//        System.out.println(money);
//        System.out.println(grade);
//        System.out.println(text);

        //Concat

//        int x = 15;
//        double pi = 3.14;
//
//        System.out.println("Donut Count:" + x + "and pi =" + pi);
//
//        String word = "JDK";
//        double version = 1.86;
        //My JDK is version: 1.86

//        System.out.println("My " + word + " is version: " + version);

        String path = System.getProperty("user.dir");
        String platform = System.getProperty("os.name");
        String JDK = System.getProperty("java.version");

        System.out.println("Project is currently at: " + path   );
        System.out.println("Test is running on: "      + platform);
        System.out.println("JDK version is: " + JDK);

    }
}
