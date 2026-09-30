package com.pokachip.cafe;

import java.util.Scanner;

public class DivideCalculator {


    // 계산 메소드 작성
    public double individual_cost (int total, int humans) {
        double individual_cost = total / humans;
        return individual_cost;
    }
}