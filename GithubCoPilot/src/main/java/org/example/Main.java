package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //create calculator
        Calculator calculator = new Calculator();
        // use calcularor class to sum some integers
        System.out.println("Sum of 1 and 2 is " + calculator.sumPositiveIntegers(1, 2));
        //reset the calculator
        calculator.resetCalculator();

        App.main(args);
    }
}