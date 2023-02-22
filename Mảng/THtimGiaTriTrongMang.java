import java.util.Scanner;

public class THtimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Nhap ten: ");
        String input_name= sc.nextLine();
        boolean isKey= false;
        for (int i=0 ;i< students.length; i++ ){
            if (students[i].equals(input_name)){
                System.out.print("Danh sach hoc sinh ten "+input_name+" co STT la "+i);
                isKey=true;
                break;
            }
        }
          if (!isKey) {
              System.out.println("khong tim thay kqua cua " + input_name);
          }
    }
}
