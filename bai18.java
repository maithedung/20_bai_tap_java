public class bai18 {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.printf("Cac so hoan hao nho hon 1000 la: \n");
        for (int i = 1; i < 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
