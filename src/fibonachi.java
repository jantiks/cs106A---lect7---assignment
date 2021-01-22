/*
class lists  fibonachi sequence
 */
import acm.program.*;

public class fibonachi extends ConsoleProgram {
    private static final int MAX_TERM_VALUE = 10000;
    public void run() {
        int current = 1 ;
        int last = 0;
        println(last);
        while (current < MAX_TERM_VALUE) {

            println(current);
            current += last;
            last = current - last;

        }
    }
}
