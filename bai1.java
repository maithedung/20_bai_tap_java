public class bai1 {
    public static double useIf(double a, double b, double c) {
        double max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    public static double useIfElse(double a, double b, double c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            }
        } else {
            if (b >= c) {
                return b;
            }
        }
        return c;
    }

    public static double threeStar(double a, double b, double c) {
        return a >= b ? (a >= c ? a : c) : (b >= c ? b : c);
    }

    public static void main(String[] args) {
        double a = 5.5;
        double b = 4.3;
        double c = 8.9;
        System.out.println(useIf(a, b, c));
        System.out.println(useIfElse(a, b, c));
        System.out.println(threeStar(a, b, c));
    }
}