package interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("tutari giriniz: ");
        double price = inp.nextDouble();

        System.out.println("kart no giriniz: ");
        String cardNumber = inp.next();

        System.out.println("son kullanim tarihini giriniz: ");
        String date = inp.next();

        System.out.println("Güvenlik kodunu(cvc) giriniz: ");
        String cvc = inp.next();

        System.out.println("1: A bankasi");
        System.out.println("2: B bankasi");
        System.out.println("3: C bankasi");
        System.out.println("Banka secin: ");
        int selectBank = inp.nextInt();

        switch (selectBank){
            case 1:
                ABankasi posA = new ABankasi("A Bankasi", "91273912873", "2987120");
                posA.connect("127.1.1.");
                posA.payment(price,cardNumber,date, cvc);
                break;
            case 2:
                BBankasi posB = new BBankasi("B Bankasi", "129817239", "3023420*" );
                posB.connect("127.2.2");
                posB.payment(price, cardNumber, date, cvc);
                break;
            default:
                System.out.println("gecerli banka giriniz!!!");
        }
    }
}
