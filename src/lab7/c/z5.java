package lab7.c;


public class z5 {
    static int max(int a, int b) {
        return (a >= b) ? a : b;
    }


    static long max(long a, long b) {
        return (a >= b) ? a : b;
    }


    static double max(double a, double b) {
        if (a != a) return a;   // a is NaN

        if ((a == 0.0d) && (b == 0.0d) &&
                (Double.doubleToRawLongBits(a) == Double.doubleToRawLongBits(-0.0d))) {
            // Raw conversion ok since NaN can't map to -0.0.
            return b;
        }
        return (a >= b) ? a : b;
    }
}