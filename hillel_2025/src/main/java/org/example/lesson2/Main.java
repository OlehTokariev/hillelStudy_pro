package org.example.lesson2;

public class Main {
    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Welcome to the Converter App!");
        System.out.println("This application converts units between miles and kilometers.");

        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        System.out.println("Result is " + pounds + " pounds.");
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}