public class bai20 {
    public static void isFibonacci(int n) {
        int counter, fib1, fib2, fib;
        counter = 2;
        fib1 = 1;
        fib2 = 1;
        fib = 2;

        while (fib1 + fib2 <= n) {
            fib = fib1 + fib2;
            fib2 = fib1;
            fib1 = fib;
            counter += 1;
        }
        if (fib == n)
            System.out.printf("So %d la so fibonacci o vi tri thu %d \n", n, counter);
        else
            System.out.printf("so %d khong phai la so fibonacci \n", n, counter);
    }

    public static void main(String[] args) {
        isFibonacci(13);
    }
}
