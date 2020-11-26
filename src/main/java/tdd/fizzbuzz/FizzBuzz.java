package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String countOff(Integer order) {
        if (order % 3 == 0) {
            return FIZZ;
        }
        else if (order % 5 == 0) {
            return BUZZ;
        }
        return order.toString();
    }
}
