import java.util.Scanner;

public class THtinhTienLaiChoVay {
    public static void main(String[] args) {
        double money= 1.0;
        int month=1;
        double laisuat= 1.0;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        money= input.nextDouble();
        System.out.print("Nhap so thang gui: ");
        month=input.nextInt();
        System.out.print("Nhap lai suat: ");
        laisuat= input.nextDouble();
        double lainhan = 0;
        for(int i = 0; i < month; i++){
            lainhan += money * (laisuat/100)/12 * month;
        }
        System.out.println("Lai suat: " + lainhan);
    }
}
