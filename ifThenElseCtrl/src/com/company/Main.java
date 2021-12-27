package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score is less than 5000 and greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score is less than 1000");
//        }
//        else {
//            System.out.println("Got here.");
//        }
        if (gameOver == true) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        //can access outside variables from inside the if code block, but cannot access them outside in main etc
        //int savedFinalScore = finalScore;
        if (gameOver) {
            score = 10000;
            levelComplete = 8;
            bonus = 200;
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Second final score was " + finalScore);
        }
    }
}
