package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        System.out.println("");

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        System.out.println("");

        //int will not show the remainder and only shows the max whole number
        int myIntValue = 5 / 3;
        //float has a lesser precision than double , 7 numbers after decimal
        float myFloatValue = 5f / 3f;
        //double has more precision, 16 numbers after decimal
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("Variable values: ");
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        System.out.println("");

        double lbValue = 160d;
        double conversionKgToLb = lbValue * .45359237d;
        System.out.println(lbValue + " US pounds equals " + conversionKgToLb + " kilograms.");

        System.out.println("");

        
    }
}
