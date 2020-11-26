package tdd.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_count_off_given_order_number_1() {
        //given
        int order = 1;
        String expected = "1";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(expected, fizzBuzz.countOff(order));
    }

    @Test
    public void should_return_fizz_when_count_off_given_order_multiple_3() {
        //given
        int order = 3;
        String expected = "Fizz";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(expected, fizzBuzz.countOff(order));
    }

    @Test
    public void should_return_fizz_when_count_off_given_order_multiple_5() {
        //given
        int order = 25;
        String expected = "Buzz";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(expected, fizzBuzz.countOff(order));
    }

    @Test
    public void should_return_whizz_when_count_off_given_order_multiple_7() {
        //given
        int order = 14;
        String expected = "Whizz";

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();

        //then
        assertEquals(expected, fizzBuzz.countOff(order));
    }

    @Test void should_return_fizzbuzz_when_count_off_given_order_multiple_3_and_5() {
        int order = 15;
        String expected = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.countOff(order));
    }


}
