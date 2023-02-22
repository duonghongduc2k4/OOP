import java.util.Scanner;

public class BTxoaPtuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhap so luong mang: ");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.print("Mang gi ma =0 voi am!!");
            }
        } while (size <= 0);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap ptu thu " + (i + 1) + " cua mang: ");
            array[i] = sc.nextInt();
        }
        System.out.print("Cac ptu trong mang: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Chon vi tri ptu can xoa: ");
        int del = sc.nextInt();
        System.out.print("Mang khi xoa: ");
        for (int i = 0; i < array.length; i++) {
            if (del - 1  == i) {
                continue;
            }
            System.out.print(" " + array[i]);
        }


    }
}
