package com.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExerciseMathTest {
    @Test
    void _1を渡すと1を返す() {
        ExerciseMath2 exerciseMath2 = new ExerciseMath2();

        int actual = ExerciseMath2.factorial(1);

        assertEquals(1, actual);
    }

    @Test
    void _2を渡すと2を返す() {
        ExerciseMath2 exerciseMath2 = new ExerciseMath2();

        int actual = ExerciseMath2.factorial(2);

        assertEquals(2, actual);
    }

    @Test
    void _4を渡すと24を返す() {
        ExerciseMath2 exerciseMath2 = new ExerciseMath2();

        int actual = ExerciseMath2.factorial(4);
        // aaaa
        assertEquals(24, actual);
    }

    @Test
    void _0を渡すと例外を返す() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath2.factorial(0));

        assertEquals("0以下の値は不正です。", expectedException.getMessage(), "メッセージが一致しません");
    }
}
