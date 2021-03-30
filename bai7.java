public class bai7 {
    public static void dateRespectively(int month, int year) {
        if (month <= 1 || month <= 12) {
            switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Thang %d co 31 ngay \n", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Thang %d co 30 ngay \n", month);
                break;
            case 2:
                if (year % 400 == 0) {
                    System.out.printf("Thang %d co 29 ngay \n", month);
                } else if (year % 4 == 0 && year % 100 != 0) {
                    System.out.printf("Thang %d co 29 ngay \n", month);
                } else {
                    System.out.printf("Thang %d co 28 ngay \n", month);
                }
            }
        }
    }

    public static void main(String[] args) {
        dateRespectively(2, 1704);
    }
}
