package ExcptinHndling;

import java.util.Scanner;

public class main {

    public static void connectTCMB(){
        System.out.println("connection is starting");

    }
    public static void main(String[] args) {
        System.out.println("program start");
        Scanner input = new Scanner(System.in);
        System.out.println("a sayisini giriniz");
        int a = input.nextInt();
        int b = 10;
        if(a == 0)
            System.out.println("sayi 0'a bolunemez");
        else
            System.out.println("sonuc: " + b/a);

        //unchecking exception
        connectTCMB();
    }


}
