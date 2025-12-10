package com.example;

public class SimpleApp {

    // SonarQube often flags unused private fields
    private final String unusedField = "Check me for issues"; 

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.doSomething(10);
    }

    /**
     * A simple method that prints a message.
     * @param value A numeric value.
     */
    public void doSomething(int value) {
        if (value > 5) {
            // SonarQube checks for System.out.println() usage in production code
            System.out.println("Value is large: " + value);
        }
    }
}
