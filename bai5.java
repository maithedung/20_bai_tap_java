public class bai5 {
    public static double middleNumber(double a, double b, double c) {
        if (b < a && a < c || c < a && a < b)
            return a;
        // Kiểm tra xem b có phải là số trung gian
        if (a < b && b < c || c < b && b < a)
            return b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(middleNumber(5, 9, 6));
    }
}
