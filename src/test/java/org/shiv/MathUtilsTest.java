package org.shiv;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Math Utils Test cases")
@EnabledOnOs(OS.WINDOWS)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void beforeAllInit(){
        System.out.println("Before all -> runs before initialization!!");
    }
    @AfterAll
    static void afterAllCleanUp(){
        System.out.println("After all-> runs after junit tests end!!");
    }

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }
    @AfterEach
    void cleanUp(){
        System.out.println("cleanup util!!");
    }
    @Test
    @EnabledOnJre(JRE.JAVA_11)
    @DisplayName("Math Utils Add Test Case")
    void testAdd() {
//        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);

        assertEquals(expected,actual,"this is the message which will be returned(returned in case of failure)!!");
    }

    @Nested
    @DisplayName("All Test for Add")
    @Tag("MathAdd")
    class AddTest{
        @Test
        @DisplayName("Math Utils Add Test Positive Case")
        void testAddPositive() {
//        MathUtils mathUtils = new MathUtils();
            int expected = 2;
            int actual = mathUtils.add(1,1);

            assertEquals(expected,actual,"this is the message which will be returned(returned in case of failure)!!");
        }
        @Test
        @DisplayName("Math Utils Add Test Negative Case")
        void testAddNegative() {
//        MathUtils mathUtils = new MathUtils();
            int expected = 2;
            int actual = mathUtils.add(-2,4);

            assertEquals(expected,actual,()->"should return "+expected+" but returned "+actual);

        }
    }


    @Test
    @Disabled
    void testComputeCircleArea() {
//        MathUtils mathUtils = new MathUtils();
        assertEquals(Math.PI*10*10,mathUtils.computeCircleArea(10),"this method will return area of circle");
    }

    @Test
    void subtract() {
//        MathUtils mathUtils = new MathUtils();
        boolean isServerIsUp = true;
        assumeTrue(isServerIsUp);
        int expected = 2;
        int actual = mathUtils.subtract(3,1);

        assertEquals(expected,actual,"this is the message which will be returned(returned in case of failure)!!");
        assumeTrue(isServerIsUp);
    }

    @Test
    @DisplayName("Test for multiply")
    void multiply() {
//        MathUtils mathUtils = new MathUtils();
//        int expected = 2;
//        int actual = mathUtils.multiply(1,2);
//        assertEquals(expected,actual,"this is the message which will be returned(returned in case of failure)!!");
//        now instead of assert equals we use assertAll which takes in multiple lambdas
        assertAll(
                () -> assertEquals(2,mathUtils.multiply(1,2),"this is the message which will be returned(returned in case of failure)!!"),
                () -> assertEquals(0,mathUtils.multiply(0,2),"this is the message which will be returned(returned in case of failure)!!"),
                () -> assertEquals(-2,mathUtils.multiply(-1,2),"this is the message which will be returned(returned in case of failure)!!")

        );
    }

    @RepeatedTest(2)
    @Tag("MathDivide")
    void divide(RepetitionInfo repetitionInfo) {
//        MathUtils mathUtils = new MathUtils();
//        int expected = 1;
//        int actual = mathUtils.divide(1,1);
        System.out.println(repetitionInfo.getCurrentRepetition());
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),"divide by 0 should throw the exception");
    }

}