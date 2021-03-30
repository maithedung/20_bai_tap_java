public class bai2 {
    public static void PTBN(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            System.out.println("PT co nghiem x= " + (-b / a));
        }
    }

    public static void main(String[] args) {
        PTBN(5, 6);
    }
}
