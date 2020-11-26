package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(Integer order) {
        StringBuilder result = new StringBuilder();
        boolean isMultipleOf3 = (order % 3 == 0);
        boolean isMultipleOf5 = (order % 5 == 0);
        boolean isMultipleOf7 = (order % 7 == 0);

        if (isMultipleOf3) {
            result.append(FIZZ);
        }
        if (isMultipleOf5) {
            result.append(BUZZ);
        }
        if (isMultipleOf7) {
            result.append(WHIZZ);
        }
        return (result.length()>0) ? result.toString() : order.toString();
    }
}
