public class bai12 {
    public static void sumAndMultiply(int m) {
        int s, p, temp;
        s = 0;
        p = 1;
        temp = m;
        while (temp > 0) {
            s += temp % 10;
            p *= temp % 10;
            temp /= 10;
        }
        System.out.printf("Tong cac chu so cua %d la %d \n", m, s);
        System.out.printf("Tich cac chu so cua %d la %d \n", m, p);
    }

    public static void main(String[] args) {
        sumAndMultiply(155);
    }
}
