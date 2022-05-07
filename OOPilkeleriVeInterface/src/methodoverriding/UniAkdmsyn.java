package methodoverriding;

public class UniAkdmsyn extends UniCalisan{

    private String bolum;
    private String unvan;

    public UniAkdmsyn(String adSoyad, int kimlinNo, String mail, String bolum, String unvan) {
        super(adSoyad, kimlinNo, mail);
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

    public void giris(String saat){
        System.out.println(this.getAdSoyad() + saat + "de giris yapti");
    }
}
