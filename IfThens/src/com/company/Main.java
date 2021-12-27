package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not celestial!");
            System.out.println("I wish it was...");
        }
        int topScore = 100;
        if (topScore == 100){
            System.out.println("High score.");
        }
        int secondScore = 60;
        if ((topScore > secondScore && topScore < 101)){
            System.out.println("Second score output...&& operator");
        }
        if ((topScore == 100) || (secondScore == 90)){
            System.out.println("Or situation output here...|| operator");
        }
        //int newErrorInt = 50;
        //if (newErrorInt = 50){
        //    System.out.println("Error Int: Does not work because of assignment = instead of logic ==");
        //}
        boolean isCar = true;
        if(isCar) {
            System.out.println("This is a quick way to bypass having to type a lot, simply tests if expression is true");
        }
        //ternary operation below: takes 3 'operands' (isCar: the one we are testing , true:what is assigned to wasCar if first condition is true, false: what is assigned to wasCar if first condition is false)
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is TRUE");
        }
        //more complex version for other situations without strict bool
        int ageOfClient = 20;
        boolean isEighteenPlus = (ageOfClient == 20) ? true:false;
        if (isEighteenPlus){
            System.out.println("isEighteenPlus = true BECAUSE ageOfClient == 20");
        }
        //precedence of operators: summary of java operator precedence table in google
        //CHALLENGE BELOW:
        double doubleOne = 20.00;
        double doubleTwo = 80.00;
        double doubleResult = (100 *(doubleOne + doubleTwo));
        double remainder = doubleResult % 40;
        boolean testRemainder = (remainder == 0) ? true : false;
        //desire - be true
        if (!testRemainder){
            System.out.println("Some remainder exists....try again...");
        }
        if (testRemainder){
            System.out.println("Desired result achieved! Congrats");
        }
        System.out.println("Baroonk I love yert! -Shmoonk (Free 5 SECOND sickle)");
    }
}
