package Refactoring_separateVariables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    /**
     * Kiểm tra khi số chia hết cho 3 thì trả về "Fizz"
     */
    @Test
    void shouldReturnFizzWhenNumberIsDivisibleBy3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    /**
     * Kiểm tra khi số chia hết cho 6 thì trả về "Fizz"
     */
    @Test
    void shouldReturnFizzWhenNumberIsDivisibleBy6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    /**
     * Kiểm tra khi số chia hết cho 5 thì trả về "Buzz"
     */
    @Test
    void shouldReturnBuzzWhenNumberIsDivisibleBy5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    /**
     * Kiểm tra khi số chia hết cho 10 thì trả về "Buzz"
     */
    @Test
    void shouldReturnBuzzWhenNumberIsDivisibleBy10() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    /**
     * Kiểm tra khi số chia hết cho 15 thì trả về "FizzBuzz"
     */
    @Test
    void shouldReturnFizzBuzzWhenNumberIsDivisibleBy15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

/**
 * Kiểm tra khi số chia hết cho 30 thì trả về "FizzBuzz"



