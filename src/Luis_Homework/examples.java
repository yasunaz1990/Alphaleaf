package Luis_Homework;

public class examples {


   public static void main(String[] args) {


        String word = "JDK";
        double version = 1.86;

        // MY JDK is version: 1.86

       System.out.println("My " + word + " is version " + version);



        // Printing path for project folder and name of OS

        String path = System.getProperty("user.dir");
        String platform = System.getProperty("os.name");

        System.out.println("Project is currently at: " + path    );
        System.out.println("Test is running on: "      + platform);

        DriverUtil.openBroswer()
   }



}