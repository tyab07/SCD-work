
public class Calculate {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
    
    public double negate(double a) {
        return -a;
    }

    public long factorial(int n) {
        if (n < 0) throw new ArithmeticException("Factorial of negative number not defined");
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
