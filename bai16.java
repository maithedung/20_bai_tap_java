import java.util.Scanner;

public class bai16 {
    public static boolean isPalindrome(int n) {
        int res = 0, temp = n;
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        if (res == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap vao so nguyen duong: ");
        int m = s.nextInt();
        if (isPalindrome(m)) {
            System.out.println(m + " la so doi xung");
        } else {
            System.out.println(m + " khong la so doi xung");
        }
        s.close();
    }
}
