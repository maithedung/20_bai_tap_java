public class bai9 {
    public static double factorial(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("Khong ton tai giai thua");
            return 0;
        }
        if (n <= 1) {
            return result;
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static float s2(int n) {
        float s = 15;
        for (int i = 1; i <= n; i++) {
            s += Math.pow(-1, i) / factorial(i);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(s2(6));
    }
}
