import java.sql.SQLOutput;
import java.util.Scanner;

public class hienThiLoiChao {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in); // tạo đối tượng thuộc lớn scanner
        System.out.println("Enter your name: ");// tạo một biến thuộc đối tượng nhập
        String name = nhap.nextLine();
        // nextline() in ra cả dòng
        // next() in nhưng phần tử nằm trước khoảng trắng
        System.out.println("Hello: "+name);
    }
}
