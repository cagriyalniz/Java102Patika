package inheritance;

public class Patika {
    public static void main(String[] args) {
        Calisan nwclsn = new Calisan("cagriy", "1230501230", "cagri@y.com");
        nwclsn.yemekhane();

        Akademisyen nwaka = new Akademisyen("ali", "12389", "ali@mail.com", "ceng", "doc");
        nwaka.giris();
        System.out.println(nwaka.getUnvan());
        nwaka.setUnvan("prof");
        System.out.println(nwaka.getUnvan());
        nwaka.derseGir();

        Memur mmr = new Memur("ismail", "10934", "ismail@mail.com", "ogrenci isleri", "09.00-18.00");
        mmr.calis();

        OgretimGorevlisi og = new OgretimGorevlisi("ayşe", "123", "ayse@mail.com", "law", "Dr", 12);
        og.cikis();
        System.out.println(og.getBolum());

        Asistan nwas = new Asistan("kerem", "30923123", "kerem@mail.com", "elhab", "asistan", "14.00-16.00");
        nwas.quizyap();

        GuvenlikGorevlisi gg = new GuvenlikGorevlisi("fatma", "0290235482", "fatma@mail.com", "iibf", "08.00-18.00", "c2");
        gg.nobet();
    }
}
