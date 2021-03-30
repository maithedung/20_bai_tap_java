public class bai8 {
    public static float s1(int n) {
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s += Float.valueOf(1) / i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(s1(6));
    }
}
