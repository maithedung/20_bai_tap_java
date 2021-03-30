import java.util.Scanner;

public class bai17 {
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
        int n = s.nextInt();
        System.out.printf("Cac so nguyen to be hon hoac bang %d la: \n", n);
        for (int i = 1; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        s.close();
    }
}
