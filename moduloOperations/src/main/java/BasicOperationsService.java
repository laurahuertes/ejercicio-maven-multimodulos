public class BasicOperationsService {

    public double Suma(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public double Resta(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public double Multiplicacion(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public double Division(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        double result = num1 / num2;
        return result;
    }
}
