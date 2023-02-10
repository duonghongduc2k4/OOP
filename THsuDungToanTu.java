import java.util.Scanner;

public class THsuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double a= scanner.nextDouble();
        System.out.println("Nhap Chieu rong: ");
        double b= scanner.nextDouble();
        double S;
        S= a*b;
        System.out.println("Dien Tich HCN: "+S+" cm2");
    }
}
