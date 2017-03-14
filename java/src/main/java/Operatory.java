/**
 * Created by marvi on 14.03.2017.
 */
public class Operatory {

    double addition(double a, double b) {
        return a + b;
    }

    double subtraction(double a, double b) {
        //ORDER MATTERS
        return a - b;
    }

    double multiplication(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        //ORDER MATTERS
        return a / 2;
    }

    double square(double a, int n) {
        return Math.sqrt(a);
    }

    double exponentiation(double a, int n) {
        return Math.pow(a, n);
    }

}
