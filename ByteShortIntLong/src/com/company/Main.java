package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Buffer Overflow = " + (myMaxIntValue + 1));
        System.out.println("Buffer Underflow = " + (myMinIntValue - 1));
        //-------------------
        // Outside of range
        // int myMaxIntTest = 2147483648;
        // for easier readability = 2_147_483_648 not really used though...
        //-------------------
        System.out.println("");
        byte myMinByteValue  = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);
        
        System.out.println("");
        
        short myMinShortValue  = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);
        
        System.out.println("");
        
        long myLongValue = 100L;
        long myMinLongValue  = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        long improperFormatLong = 2_147_483_648L;
        System.out.println(improperFormatLong + " Fixed long with L appended to end.");

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        //challenge below!

        byte challengeByte = 100;
        short challengeShort = 500;
        int challengeInt = 9000;
        long challengeLong = 50_000L + (10L * (challengeByte + challengeShort + challengeInt));
        System.out.println("Challenge results: " + challengeLong);

        short challengeShort2 = (short) (1000 + (10 * (challengeByte + challengeShort + challengeInt)));


    }
}
