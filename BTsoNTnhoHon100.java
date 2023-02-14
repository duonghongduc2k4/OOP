import java.util.Scanner;

public class BTsoNTnhoHon100 {
    public static void main(String[] args) {
        System.out.println("2");
        int status = 1;
        int num = 3;
        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print(num + " ");
                i++;
            }
            status=1;
            num++;
        }
    }
}
