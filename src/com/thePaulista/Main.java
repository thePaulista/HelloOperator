package com.thePaulista;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 100, 2, 3);

        calculateScore(false, 1, 1, 1);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was "  + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
