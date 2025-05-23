package com.example.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseMathTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void TestFactorial1(){
        int actualAnswer = ExerciseMath.factorial(1);
        assertEquals(1, actualAnswer, "TC1：期待値と実際の値が異なります");
    }

    @Test
    void TestFactorial2(){
        int actualAnswer = ExerciseMath.factorial(2);
        assertEquals(2, actualAnswer, "TC2：期待値と実際の値が異なります");
    }

    @Test
    void TestFactorial3(){
        int actualAnswer = ExerciseMath.factorial(5);
        assertEquals(120, actualAnswer, "TC3：期待値と実際の値が異なります");
    }

    @Test
    void TestFactorial4(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath.factorial(0));
        assertEquals("0以下の値は不正です。", expectedException.getMessage(), "TC4：期待値と実際の値が異なります");
    }

    @Test
    void TestFactorial5(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath.factorial(-1));
        assertEquals("0以下の値は不正です。", expectedException.getMessage(), "TC5：期待値と実際の値が異なります");
    }

    @Test
    void TestFactorial6(){
        int actualAnswer = ExerciseMath.factorial(12);
        assertEquals(479001600, actualAnswer, "TC6：期待値と実際の値が異なります");
    }

    @Test
    void TestFactorial7(){
        try{
            ExerciseMath.factorial(13);
            fail("例外が発生しなければいけません。");
        }catch (IllegalArgumentException ex){
            assertEquals("13以上の値は不正です。", ex.getMessage(), "メッセージが一致しません");
        }
    }

    @Test
    void TestFactorial8(){
        try{
            ExerciseMath.factorial(14);
            fail("例外が発生しなければいけません。");
        }catch (IllegalArgumentException ex){
            assertEquals("13以上の値は不正です。", ex.getMessage(), "メッセージが一致しません");
        }
    }

    @Test
    void TestFail(){
        fail("失敗するよ");
    }
}