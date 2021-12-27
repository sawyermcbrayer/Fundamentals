package com.company;

public class Main {

    public static void main(String[] args) {
        int highscore = calculateScore(true , 800, 5 , 100);
        System.out.println("Your final highscore was " + highscore);

        highscore = calculateScore(true , 10000, 8 , 200);
        System.out.println("Your second final highscore was " + highscore);

//remember dis shit right here
        int calc = calculateHighScorePosition(1500);
        displayHighScorePosition("Joe" , calc);
        calc = calculateHighScorePosition(900);
        displayHighScorePosition("Mary" , calc);
        calc = calculateHighScorePosition(400);
        displayHighScorePosition("Josephine" , calc);
        calc = calculateHighScorePosition(50);
        displayHighScorePosition("Clerk" , calc);

        double storeConvRes = toMilesPerHour(75.114);
        printConversion(storeConvRes);

    }
    //void means dont return anything, to return you have to remove void and change to data type
    public static int calculateScore(boolean gameOver , int score , int levelComplete , int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return  -1;
    }
// ---------------------------------------------------------------------------
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into postion " + position + " on the leader board!");
    }
// ------------------------------------------------------------------------------
    public static int calculateHighScorePosition(int scoreHere) {
        if(scoreHere >= 1000){
            return 1;
        } else if(scoreHere >= 500){
            return 2;
        } else if(scoreHere >= 100){
            return 3;
        } else {
            return 4;
        }
    }

    //-------------here is coding challenge one - move to different file after completion------------

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
            System.out.println((kilometersPerHour * 1.609) + " mph is " + kilometersPerHour + " kph!");
        }

    }


}
