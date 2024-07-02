package org.shiv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);

        assertEquals(expected,actual,"this is the message which will be returned(returned in case of failure)!!");
    }

    @Test
    void testComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(Math.PI*10*10,mathUtils.computeCircleArea(10),"this method will return area of circle");
    }

    @Test
    void subtract() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.subtract(3,1);

        assertEquals(expected,actual,"this is the message which will be returned(returned in case of failure)!!");
    }

    @Test
    void multiply() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.multiply(1,2);
        assertEquals(expected,actual,"this is the message which will be returned(returned in case of failure)!!");
    }

    @Test
    void divide() {
        MathUtils mathUtils = new MathUtils();
        int expected = 1;
//        int actual = mathUtils.divide(1,1);
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),"divide by 0 should throw the exception");
    }
}