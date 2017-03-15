/**
 * Created by marvi on 14.03.2017.
 * podstawowe działania tak żeby sie nie rypało
 */
public class Operatory {

    /**
     * change to float
     *
     * @param a 1. liczna
     * @param b 2. liczba
     * @return a+b
     */
    double addition(double a, double b) {
        return a + b;
    }

    /**
     * change to float
     * ORDER MATTERS
     * @param a 1. liczna
     * @param b 2. liczba
     * @return a-b
     */
    double subtraction(double a, double b) {
        return a - b;
    }

    double multiplication(double a, double b) {
        return (float) a * (float) b;
    }

    /**
     * change to float
     * ORDER MATTERS
     * @param a 1. liczna
     * @param b 2. liczba
     * @return (float)a / (float)b
     */
    double division(double a, double b) {
        return (float) a / (float) b;
    }

    /**
     * dont used
     * @param a podstawa
     * @param n stopień
     * @return used exposition
     */
    double square(double a, int n) {
        return (float) exponentiation((float) a, ((float) 1 / (float) n));
        //return Math.sqrt((float) a);
    }

    /**
     * dont used
     * @param a podstawa
     * @param n stopień
     * @return pow(a, n)
     * @exception Math.pow
     */
    double exponentiation(double a, double n) {
        return Math.pow((float) a, (float)n);
    }

}
