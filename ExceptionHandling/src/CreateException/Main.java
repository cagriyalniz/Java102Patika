package CreateException;

import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws AgeCheckException{
        if(age < 18){
            throw new AgeCheckException("hata yakalandi...");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("yasinizi giriniz: ");
        int age = inp.nextInt();
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("program bitti");
    }
}
