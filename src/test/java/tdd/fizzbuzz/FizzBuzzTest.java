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

}
