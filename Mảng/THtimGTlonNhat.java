import java.util.Scanner;

public class THtimGTlonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] money;
        int size;
        do{
            System.out.print("Nhap so luong mang: ");
            size= sc.nextInt();
            if (size>20)
                System.out.print("Nhap it thoi");
        }while (size>20);
        money=new int[size];
        for (int i=0; i< money.length; i++){
            System.out.print("Nhap so phan tu thu "+(i+1)+" cua mang: ");
            money[i]= sc.nextInt();
        }
        System.out.print("Cac phan tu trong mang: ");
        for (int i=0; i< money.length; i++){
                System.out.print(money[i]+" ");
            }
        System.out.println();
        int max=money[0];
        int index=1;
        for(int i=0; i< money.length; i++){
            if (money[i]>max){
                max=money[i];
                index= 1+i;
            }
        }
        System.out.print("Gia tri lon nhat la: "+max+" o vi tri thu "+index);

    }

}
