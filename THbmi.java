import java.util.Scanner;

public class THbmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Chieu Cao: ");
        double height = scanner.nextDouble();
        System.out.println("Nhap Can Nang: ");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println(" rat gay");
        } else if (bmi < 25.0) {
            System.out.println(" binh thuong");
        } else if (bmi < 30.0) {
            System.out.println(" beo" );
        }else {
            System.out.println("qua beo");
        }
    }
}
