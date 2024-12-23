package Refactoring_separateVariables;

public class fizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }

        if (isFizz) {
            return "Fizz";
        }

        if (isBuzz) {
            return "Buzz";
        }

        return Integer.toString(number);
    }
}
