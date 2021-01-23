/*
class defines if the number is perfect square or not
 */

import acm.program.*;

public class perfectSquare extends ConsoleProgram {
    public void run() {

        double number = readDouble("number: ");
        if (isPerfectSquare(number)) {
            println("true");
        } else {
            println("false");
        }

    }

    private boolean isPerfectSquare(double number) {
        double squaredNumber = Math.sqrt(number);
        int naturalSqrt = (int) squaredNumber;
        if (squaredNumber / (double)naturalSqrt == 1) {
            return true;
        } else {
            println(squaredNumber / (double)naturalSqrt );
            return false;
        }
    }
}
