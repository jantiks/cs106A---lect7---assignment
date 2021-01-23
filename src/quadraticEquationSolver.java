/*
this class calculates quadratic equation roots
 */
import acm.program.*;

public class quadraticEquationSolver extends ConsoleProgram {
    // runs program
    public void run() {
        // getting a , b , c from user
        double a = readDouble("a: ");
        double b = readDouble("b: ");
        double c = readDouble("c: ");

        // claculating discriminants
        double discriminant = calculateDiscriminant(a, b, c);

        // calculating roots
        if (discriminant > 0) {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double x1 = calculateRoot(a , b , sqrtDiscriminant);
            double x2 = calculateRoot(a , b , -sqrtDiscriminant);
            println("first solution is: " + x1);
            println("second solution is: " + x2);
        } else if (discriminant == 0) {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double x = calculateRoot(a , b , sqrtDiscriminant);
            println("solution is: " + x);
        } else {
            println("discriminant is less that 0");
        }
    }

    // method calculates discriminant
    private double calculateDiscriminant(double a, double b, double c){
        double discriminant = b*b - 4*a*c;
        return discriminant;
    }

    // method calculates root
    private double calculateRoot(double a , double b , double sqrtDiscriminant) {
        double x = (-b + sqrtDiscriminant) / (2 * a);
        return x;
    }
}
