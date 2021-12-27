package com.company;

public class Main {

    public static void main(String[] args) {
        //8 PRIMITIVE DATA TYPES: a recap
	    //byte -128 +127
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string value";
        System.out.println("My string is = to: " + myString);
        myString = myString + ", and this is appended string data.";
        System.out.println("My string is = to: " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("My string is = to: " + myString);

        System.out.println("");

        String numberString = "250.55";
        numberString = numberString + ", 49.95";
        System.out.println(numberString);

        System.out.println("");

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);

        System.out.println("");

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is equal to " + lastString);
    }
}
