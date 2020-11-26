package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(Integer order) {
        StringBuilder result = new StringBuilder();

        if (order % 3 == 0) {
            result.append(FIZZ);
        }
        if (order % 5 == 0) {
            result.append(BUZZ);
        }
        if (order % 7 == 0) {
            return WHIZZ;
        }
        return (result.length()>0) ? result.toString() : order.toString();
    }
}
