public class bai6 {
    public static double calculateCost(int a, int b) {
        if (b <= a) {
            return 0;
        }
        if (b < 18) {
            return 45000 * (b - a);
        }
        return 60000 * (b - a);
    }

    public static void main(String[] args) {
        System.out.println(calculateCost(19, 20));
    }
}
