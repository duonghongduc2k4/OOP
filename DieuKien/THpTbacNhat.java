import java.util.Scanner;

public class THpTbacNhat {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("a: ");
        double a= src.nextDouble();
        System.out.println("b: ");
        double b= src.nextDouble();
        System.out.println("c: ");
        double c= src.nextDouble();
        if (a!=0) {
            double key= (c-b)/a;
            System.out.println("Phuong Trinh Co Nghiem Duy Nhat: "+key);
        } else if (b==c) {
            System.out.println("PT Vo So Nghiem");
        }else {
            System.out.println("Pt vo nghiem");
        }

    }
}
