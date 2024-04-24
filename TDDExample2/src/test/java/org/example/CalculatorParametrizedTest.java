// Student No: B221202047
// Name : Mustafa Talha Zehir
// Course Name : Software Verification and Validation
// Homework 1
// https://github.com/talhazehir/Software-Verification-and-Validation-

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParametrizedTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() {
        assertEquals(5, Calculator.divide(12.5f, 2.5f));
    }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5f));
    }

    @Test
    void testDivision5() {
        assertEquals(2.5f, Calculator.divide(12.5f, 5));
    }

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }

    void testDivision(float dividend, float divisor, float expectedResult) {
        if (divisor == 0) {
            Exception exception = assertThrows(
                    IllegalArgumentException.class,
                    () -> Calculator.divide(dividend, divisor),
                    "IllegalArgumentException expected."
            );

            // Optional. To check whether the error messages match.
            assertEquals("Illegal Argument Exception.", exception.getMessage());
        } else {
            float result = Calculator.divide(dividend, divisor);
            assertEquals(expectedResult, result);
        }
    }
}