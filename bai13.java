public class bai13 {
    public static int UCLN(int a, int b) {
        if (b == 0)
            return a;
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;
        System.out.println("USCLN của " + a + " và " + b + " là: " + UCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BCNN(a, b));
    }
}
