package inheritance;

public class LabAsistani extends Asistan{

    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void LabaGir(){
        System.out.println(getAdSoyad() + getBolum() + " labina girdi");
    }
}
