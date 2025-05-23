package com.example.util;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void setUpBeforeClass(){

    }

    @AfterAll
    static void tearDownAfterClass(){

    }

    @Test
    void TestPower1(){
        double actualAnswer = MathUtil.power(0, -2);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1：期待値と実際の値が異なります");
    }

    @Test
    void TestPower2(){
        double actualAnswer = MathUtil.power(0, -1);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC2：期待値と実際の値が異なります");
    }

    @Test
    void TestPower3(){
        double actualAnswer = MathUtil.power(0, 0);
        assertEquals(1.0, actualAnswer, "TC3：期待値と実際の値が異なります");
    }

    @Test
    void TestPower4(){
        double actualAnswer = MathUtil.power(0, 1);
        assertEquals(0.0, actualAnswer, "TC4：期待値と実際の値が異なります");
    }

    @Test
    void TestPower5(){
        double actualAnswer = MathUtil.power(0, 2);
        assertEquals(0.0, actualAnswer, "TC5：期待値と実際の値が異なります");
    }

    @Test
    void TestPower6(){
        double actualAnswer = MathUtil.power(1, -2);
        assertEquals(1.0, actualAnswer, "TC6：期待値と実際の値が異なります");
    }

    @Test
    void TestPower7(){
        double actualAnswer = MathUtil.power(1, -1);
        assertEquals(1.0, actualAnswer, "TC7：期待値と実際の値が異なります");
    }

    @Test
    void TestPower8(){
        double actualAnswer = MathUtil.power(1, 0);
        assertEquals(1.0, actualAnswer, "TC8：期待値と実際の値が異なります");
    }

    @Test
    void TestPower9(){
        double actualAnswer = MathUtil.power(1, 1);
        assertEquals(1.0, actualAnswer, "TC9：期待値と実際の値が異なります");
    }

    @Test
    void TestPower10(){
        double actualAnswer = MathUtil.power(1, 2);
        assertEquals(1.0, actualAnswer, "TC10：期待値と実際の値が異なります");
    }

    @Test
    void TestPower11(){
        double actualAnswer = MathUtil.power(-1, -2);
        assertEquals(1.0, actualAnswer, "TC11：期待値と実際の値が異なります");
    }

    @Test
    void TestPower12(){
        double actualAnswer = MathUtil.power(-1, -1);
        assertEquals(-1.0, actualAnswer, "TC12：期待値と実際の値が異なります");
    }

    @Test
    void TestPower13(){
        double actualAnswer = MathUtil.power(-1, 0);
        assertEquals(1.0, actualAnswer, "TC13：期待値と実際の値が異なります");
    }

    @Test
    void TestPower14(){
        double actualAnswer = MathUtil.power(-1, 1);
        assertEquals(-1.0, actualAnswer, "TC14：期待値と実際の値が異なります");
    }

    @Test
    void TestPower15(){
        double actualAnswer = MathUtil.power(-1, 2);
        assertEquals(1.0, actualAnswer, "TC15：期待値と実際の値が異なります");
    }

    @Test
    void TestPower16(){
        double actualAnswer = MathUtil.power(2, -2);
        assertEquals(0.25, actualAnswer, "TC16：期待値と実際の値が異なります");
    }

    @Test
    void TestPower17(){
        double actualAnswer = MathUtil.power(2, -1);
        assertEquals(0.5, actualAnswer, "TC17：期待値と実際の値が異なります");
    }

    @Test
    void TestPower18(){
        double actualAnswer = MathUtil.power(2, 0);
        assertEquals(1.0, actualAnswer, "TC18：期待値と実際の値が異なります");
    }

    @Test
    void TestPower19(){
        double actualAnswer = MathUtil.power(2, 1);
        assertEquals(2.0, actualAnswer, "TC19：期待値と実際の値が異なります");
    }

    @Test
    void TestPower20(){
        double actualAnswer = MathUtil.power(2, 2);
        assertEquals(4.0, actualAnswer, "TC20：期待値と実際の値が異なります");
    }

    @Test
    void TestPower21(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> MathUtil.power(100, 0));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC21：期待値と実際の値が異なります");
    }

    @Test
    void TestPower22(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> MathUtil.power(0, 100));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC22：期待値と実際の値が異なります");
    }

}