import java.util.Scanner;

public class bai14 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap vao so nguyen duong: ");
        int m = s.nextInt();
        if (isPrimeNumber(m)) {
            System.out.println(m + " la so nguyen to");
        } else {
            System.out.println(m + " khong la so nguyen to");
        }
        s.close();
    }
}
