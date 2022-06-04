package interfaces;

public class BBankasi implements IBanka{
    public String bankaAdi;
    public String terminalId;
    public String password;

    public BBankasi(String bankaAdi, String terminalId, String password){
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public boolean connect(String IPAdress) {
        System.out.println("b bankasina baglanildi");
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        return false;
    }
}
