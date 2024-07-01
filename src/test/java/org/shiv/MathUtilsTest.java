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
}