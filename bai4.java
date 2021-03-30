public class bai4 {
    public static void HPTBN(double a, double b, double c, double d, double e, double f) {
        double D, Dx, Dy, x, y;
        D = a * e - d * b;
        Dx = c * e - f * b;
        Dy = a * f - d * c;
        if (D == 0) {
            if (Dx + Dy == 0)
                System.out.println("He phuong trinh co vo so nghiem");
            else
                System.out.println("He phuong trinh vo nghiem");
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.println("He phuong trinh co nghiem x = " + x + "; y = " + y);
        }
    }

    public static void main(String[] args) {
        HPTBN(1, 2, 3, 4, 5, 6);
    }
}
