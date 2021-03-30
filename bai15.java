import java.util.Scanner;

public class bai15 {
    public static boolean checkPerfectSquare(double x) {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap vao so nguyen duong: ");
        int m = s.nextInt();
        if (checkPerfectSquare(m)) {
            System.out.println(m + " la so chinh phuong");
        } else {
            System.out.println(m + " khong la so chinh phuong");
        }
        s.close();
    }
}
