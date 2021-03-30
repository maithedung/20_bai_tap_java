public class bai19 {
    public static void Fibonacci(int n) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter += 1;
        }
    }

    public static void main(String[] args) {
        int n;
        n = 10;
        Fibonacci(10);
        System.out.println();
    }
}
