import java.util.Scanner;

public class THdaoNguocCacPTu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap so luong mang:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Nhap it thoi");
        } while (size > 20);
        array = new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("Phan tu thu "+(i+1)+" : ");
            array[i]= scanner.nextInt();
        }
        System.out.print("Du Lieu Cua Mang: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +"  ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println();
        System.out.print( "Mang dao nguoc: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
        }
    }
}
