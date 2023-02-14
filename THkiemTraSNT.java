import java.util.Scanner;

public class THkiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap So: ");
        int number= scanner.nextInt();
        if (number <2) {
            System.out.println(number+" Khong phai so NT");
        }else {
            int i =2;
            boolean check=true;
            while (i <= Math.sqrt(number)){
                if (number %i==0 ) {
                    check = false;
//                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number+" la so NT");
            }else {
                System.out.println(number+" Khong phai so NT");
            }
        }

    }
}
