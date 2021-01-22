/*
the class reverses the digits of numbers
 */

import acm.program.*;

public class reverseDigits extends ConsoleProgram {
    public void run() {
        int number = readInt("enter number ");
        int reversed = 0;

        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }
        println(reversed);
    }
}
