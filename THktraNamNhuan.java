import java.util.Scanner;

public class THktraNamNhuan {
    public static void main(String[] args) {
        System.out.println("Nhap Nam: ");
        Scanner year= new Scanner(System.in);
        int nam= year.nextInt();
//        if (nam % 4==0 && nam %100!=0) {
//            System.out.println("Nam Nhuan");
//        } else if (nam%100==0&& nam%400!=0) {
//            System.out.println("Khong Phai Nam Nhuan");
//        }else if (nam%100==0&&nam%400==0){
//            System.out.println("Nam Nhuan");
//        }else {
//            System.out.println("Khong Phai Nam Nhuan");
//        }
        if(nam % 4 == 0){
            if(nam % 100 == 0){
                if(nam % 400 == 0){
                    System.out.printf("%d is a leap year", nam);
                } else {
                    System.out.printf("%d is NOT a leap year", nam);
                }
            } else {
                System.out.printf("%d is a leap year", nam);
            }
        } else {
            System.out.printf("%d is NOT a leap year", nam);
        }

    }
}
