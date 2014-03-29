package by.minsler;

/**
 * Class to get sqrt and sum.
 *
 * @author Dmitry Vorobey
 */
public class Calculator {

    /**
     * Returns sqrt for the input number.
     *
     * @param x input number to get sqrt from
     *
     * @return sqrt for input number
     */
    public static double sqrt(int x) {
        return Math.sqrt(x);
    }

    /**
     * Returns sum for input numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return sum of input numbers
     */
    public static double sum(double a, double b) {
        return a + b;
    }
}