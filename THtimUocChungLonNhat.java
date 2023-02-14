import java.util.Scanner;

public class THtimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int number1= num.nextInt();
        System.out.print("Nhap so b: ");
        int number2= num.nextInt();
        number1= Math.abs(number1);
        number2= Math.abs(number2);
        if (number1==0||number2==0) {
            System.out.println("khong co UCLN");
        }
        while (number1  !=number2){
            if (number1 >number2) {
                number1= number1- number2;
            }else {
                number2=number2-number1;
            }
            System.out.println("UCLN la: " + number1);

        }
    }
}
