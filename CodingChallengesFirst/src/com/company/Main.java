package com.company;

public class Main {

    public static void main(String[] args) {
        printConversion(2);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else if (kilometersPerHour >=0){
            return Math.round(kilometersPerHour / 1.609);
        } else return -1;
    }


    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour == -1){
            System.out.println("Invalid Input");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " kph is = to " + milesPerHour + " mph.");
        }

    }
}
