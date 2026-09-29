package com.pokachip.cafe;

public class MultiplyCalculator {

    public int multiply(int calories, int Counts) {
        return calories * Counts;
    }

    public void printCalorieTable(int calories, int maxCounts) {
        for (int i = 1; i <= maxCounts; i++) {
            System.out.println(i + "개 : " + multiply(calories, i) + " kcal");
        }

    }
}