package inheritance;

public class Akademisyen extends Calisan{
    //kalitim yapiliyorsa superclass ın constructırı yazilmak zorunda

    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan){
        super(adSoyad, telefon, eposta); //super constructırda kullanilir
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse girdi");
    }
}
