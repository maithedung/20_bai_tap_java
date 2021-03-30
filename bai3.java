import static java.lang.Math.sqrt;

public class bai3 {
    public static void PTBH(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PT vo so nghiem");
                } else {
                    System.out.println("PT vo nghiem");
                }
            } else {
                System.out.println("PT co 1 nghiem duy nhat : " + (-c / b));
            }
        } else {
            double delta;
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("PT vo nghiem");
            } else if (delta == 0) {
                System.out.println("PT co mot nghiem la : " + (-b / (2 * a)));
            } else {
                double x1, x2;
                x1 = (float) ((-b + sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - sqrt(delta)) / (2 * a));
                System.out.println("PT co 2 nghiem phan biet la : " + x1 + "; " + x2);
            }
        }
    }

    public static void main(String[] args) {
        PTBH(-3, 4, 5);
    }
}
