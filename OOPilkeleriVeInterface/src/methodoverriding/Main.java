package methodoverriding;

import inheritance.Calisan;

public class Main {
    public static void main(String[] args) {

        UniCalisan eleman = new UniCalisan("ali komputer", 123, "ali@bt.com");
        eleman.giris();

        UniAkdmsyn akademi = new UniAkdmsyn("ayşe yalın", 123098, "ayshe@uniakademi.com", "iibf", "doc");
        akademi.giris("11.00");


    }
}
