public class bai11 {
    public static double doubleFactorial(int n) {
        double result = 1;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                result *= i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(doubleFactorial(13));
    }
}
