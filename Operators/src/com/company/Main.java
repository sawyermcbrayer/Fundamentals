package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; //1+2=3
        System.out.println(result);
        int previousResult = result;
        System.out.println("previousResult = " + result);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        System.out.println("");

        //Abbreviating Operators Section Below:

        result++; //last value was 2, now to 3
        System.out.println(result);
        //from 3 to 2
        result--;
        System.out.println(result);
        //now to 4
        result += 2;
        System.out.println(result);
        //now to 40
        result *= 10;
        System.out.println(result);
        //now to 4 again
        result /= 10;
        System.out.println(result);
        //now to 3
        result -= 1;
        System.out.println(result);

    }
}
