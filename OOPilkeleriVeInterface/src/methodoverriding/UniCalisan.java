package methodoverriding;

public class UniCalisan {

    private String adSoyad;
    private int kimlinNo;
    private String mail;

    public UniCalisan(String adSoyad, int kimlinNo, String mail){
        this.adSoyad = adSoyad;
        this.kimlinNo = kimlinNo;
        this.mail = mail;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getKimlinNo() {
        return kimlinNo;
    }

    public void setKimlinNo(int kimlinNo) {
        this.kimlinNo = kimlinNo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void giris(){
        System.out.println((this.adSoyad + "giris yapti"));
    }

    public void cikis(){
        System.out.println(this.adSoyad + "cikis yapti");
    }
}


