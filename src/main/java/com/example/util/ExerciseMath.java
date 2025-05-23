package com.example.util;

public class ExerciseMath {

    /**
     * 1~nまでの積を求める.
     * @param n 階乗
     * @return 1～nまでの積
     * @throws IllegalArgumentException nが0以下の時に発生する（この時例外オブジェクトには「0以下の値は不正です。」と含める）
     */
    public static int factorial(int n){
        if (n <= 0){
            throw new IllegalArgumentException("0以下の値は不正です。");
        } else if (n >= 13) {
            throw new IllegalArgumentException("13以上の値は不正です。");
        }
        int sum = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }
}
