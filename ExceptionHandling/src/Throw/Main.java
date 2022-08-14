package Throw;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws Exception {
        if(age < 18){
            throw new Exception("yasiniz tutmuyor");
        }
        System.out.println("yasiniz uygundur");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("yasinizi girin: ");
        int age = inp.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("yasi uymadi");
        }

        System.out.println("program sona erdi");
    }
}
