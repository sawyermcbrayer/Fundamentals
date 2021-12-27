package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while(count < 6){
            System.out.println("Count value is: " + count);
            count++;
        }
        System.out.println("*********************");
        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is (second example): " + count);
            count++;
        }
        System.out.println("*********************");
        //do while will always be executed at least one time! make sure it is not == to while criteria ie 6 gets +1 incrementer, then its 7 which** is != 6, and it never will be again! infinite loop.
        count = 1;
        do {
            System.out.println("Count value is (third example):" + count);
            count++;
        } while(count != 6);
        System.out.println("*********************");

        //************************************
        int startNum = 1;
        int finishNum = 10;
        int evenCounter = 0;

        while (startNum <= finishNum){
            startNum++;

            if(!isEvenNumber(startNum)){
                continue;
            }
            System.out.println("Even number: " + startNum);
            evenCounter ++;

            if (evenCounter >= 5){
                break;
            }
        }
        System.out.println("Total amount of even numbers: " + evenCounter);
    }
    public static boolean isEvenNumber (int number) {

        return (number % 2 == 0);

    }
}
