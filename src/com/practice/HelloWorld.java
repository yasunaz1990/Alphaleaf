package com.practice;


// Class is collection of
// Methods
public class HelloWorld
{
    // Main method
    public static void main(String[] args) {
        pauseFor10Seconds();
        System.out.println("hi");
        System.out.println("Some modificaitons");
    }

    public static void pauseFor10Seconds() {
        try{
            Thread.sleep(10000);
        }catch (Exception e) {
            // do nothing
        }
    }
    
}
