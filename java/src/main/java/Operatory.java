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
        return (float) a * (float) b;
    }

    double division(double a, double b) {
        //ORDER MATTERS
        return (float) a / (float) b;
    }

    double square(double a, int n) {
        return Math.sqrt((float) a); //TODO: DODA n
    }

    double exponentiation(double a, int n) {
        return Math.pow((float) a, n);
    }

}
