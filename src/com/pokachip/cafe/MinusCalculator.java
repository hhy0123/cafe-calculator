package com.pokachip.cafe;

public class MinusCalculator {

    public int remain(int target, int eaten) {
        return target - eaten;
    }

    public String judge(int target, int eaten) {
        int result = remain(target, eaten);

        if (result < 0) {
            return -result + " kcal 초과했습니다.";
        } else {
            return result + " kcal 더 먹을 수 있습니다.";
        }
    }
}
