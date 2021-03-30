public class bai10 {
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

    public static float s3(int n) {
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1 / factorial(2*i-1);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(s3(3));
    }
}
