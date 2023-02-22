import java.util.Scanner;

public class BTdocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số: ");
        int number = scanner.nextInt();
        int st1= number/100;
        int st2= (number/10)%10;
        int st3= number % 10;
        String str="";
        switch (st1) {
            case 1: str="one hundred ";break;
            case 2: str="two hundred ";break;
            case 3: str="three hundred ";break;
            case 4: str="four hundred ";break;
            case 5: str="five hundred ";break;
            case 6: str="six hundred ";break;
            case 7: str="seven hundred ";break;
            case 8: str="eight hundred ";break;
            case 9: str="nine hundred ";break;
        }
        switch (number) {
            case 10: str="ten ";break;
            case 11: str="eleven ";break;
            case 12: str="twelve ";break;
            case 13: str="thirteen ";break;
            case 14: str="fourteen ";break;
            case 15: str="fifteen ";break;
            case 16: str="sixteen ";break;
            case 17: str="seventeen ";break;
            case 18: str="eighteen ";break;
            case 19: str="nineteen ";break;

        }
        switch (st2){
            case 2: str= str+"twenty ";break;
            case 3: str= str+"thirty ";break;
            case 4: str= str+"forty ";break;
            case 5: str= str+"fifty ";break;
            case 6: str= str+"sixty ";break;
            case 7: str= str+"seventy ";break;
            case 8: str= str+"eighty ";break;
            case 9: str= str+"ninety ";break;
        }
        if (st2==1 ) {
        }else {
            switch (st3) {
                case 1: str= str+"one ";break;
                case 2: str= str+"two ";break;
                case 3: str= str+"three ";break;
                case 4: str= str+"four ";break;
                case 5: str= str+"five ";break;
                case 6: str= str+"six ";break;
                case 7: str= str+"seven ";break;
                case 8: str= str+"eight ";break;
                case 9: str= str+"nine ";break;
            }
        }
        System.out.println(str);
    }
}
