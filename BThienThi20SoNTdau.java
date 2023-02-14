public class BThienThi20SoNTdau {
    public static void main(String[] args) {
        int status = 1;
        int num = 2;
        System.out.println("số nguyên tố nhỏ hơn 100 là:");
        for (int i = 2; i <100;i++ ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print(num + " ");
            }
            status = 1;
            num++;
        }
    }
}
