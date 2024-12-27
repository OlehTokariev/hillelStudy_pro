package org.example.lesson2;

public class Main {
    private static final double CONV_K = 2.20462;
    private static final double CONV_M_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Welcome to the Converter App!");
        System.out.println("This application converts units between miles and kilometers.");

        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        System.out.println("Result is " + pounds + " pounds.");

        double miles = 10;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " kilometers.");

        kilometers = 160.934;
        miles = kilometersToMiles(kilometers);
        System.out.println(kilometers + " kilometers = " + miles + " miles.");
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }

    private static double milesToKilometers(double miles) {
        return miles * CONV_M_KM;
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers / CONV_M_KM;
    }
}