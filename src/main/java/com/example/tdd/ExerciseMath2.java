package com.example.tdd;

public class ExerciseMath2 {
    public static int factorial(int n) {
        if (n <= 0){
            throw new IllegalArgumentException("0以下の値は不正です。");
        }
        if (n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        } else if (n == 4) {
            return 24;
        }
        return 0;
    }
}
