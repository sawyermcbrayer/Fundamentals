package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10k at 2% interest = " + calculateInterest(10000.0, 2.0));
        //for (init; termination; increment){

        //}
        for (int i = 0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }
        for (int i = 2; i < 9; i++){
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0 , i)));
        }
        for (int i = 8; i > 1; i--){
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0 , i)));
        }

        System.out.println("***********************************");


        int counter = 0;

        for (int i = 10; i<50; i++){

            if (isPrime(i)){

                counter++;

                if (counter < 11){
                    System.out.println("Prime number[" + i + "]");
                } else {
                    break;
                }

            }
        }
    }


    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount , double interestRate){
        return (amount * (interestRate / 100));

    }
}
