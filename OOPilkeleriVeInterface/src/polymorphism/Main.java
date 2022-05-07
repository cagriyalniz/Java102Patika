package polymorphism;

import inheritance.Akademisyen;
import inheritance.Calisan;
import inheritance.Memur;

public class Main {
    public static void main(String[] args) {
        Calisan nwc = new Calisan("c1", "123", "mail@mail.com");
        Akademisyen nwa = new Akademisyen("aka", "091", "aka@mail.com", "law", "prof");
        Memur nwm = new Memur("mem", "221", "mem@mail.com", "bt", "08.00-18.00");

       Calisan calaka = new Akademisyen("cakadem", "9129", "mail.mail", "medicine", "doc");
        //calisan sinifinin metotlarini kullanip akademisyen sinifinin metotlarini kullanamaz

        Calisan[] loguser = {nwc, nwa, nwm, calaka};
        Calisan.girisyapanlar(loguser);

    }
}
