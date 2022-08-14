package TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c;
        int[] ar = new int[3];
        //try catch maliyetli
        //metot try catch içine alınamaz
        try{
            System.out.println("bolme islemi basladı");
            System.out.println(b/a);
            System.out.println("bolme bitti");
            System.out.println("c degerini giriniz: ");
            c = inp.nextInt();
            ar[5] = 12;
        }/*catch (ArithmeticException e){
            System.out.println("aritmetik hata yakalandi");
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("input error");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("segfault! out of index!");
            System.out.println(e.getMessage());
        }*/catch (Exception e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("bu bolum kesin calisacak");
            //orn: data connection kapatmak icin
        }


        System.out.println("program bitti");
    }
}
