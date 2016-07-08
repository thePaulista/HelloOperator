package com.thePaulista;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 100, 2, 3);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was "  + finalScore);
        }
    }
}
