package interfaces;
/*
interfacelerin icinde sadece finally degisken kullanilir
 */
public class ABankasi implements IBanka{


        public String bankaAdi;
        public String terminalId;
        public String password;

        public ABankasi(String bankaAdi, String terminalId, String password){
            this.bankaAdi = bankaAdi;
            this.terminalId = terminalId;
            this.password = password;
        }

        @Override
        public boolean connect(String ipAdress){
            System.out.println("kullanici ip: " + ipAdress);
            System.out.println("makine ip: " + this.hostIP);
            System.out.println("baglanti gerceklesti!!");
            return true;
        }
        @Override
        public boolean payment(double price, String cardNumber, String expiryDate, String cvc){
            System.out.println("payment fonksiyonu: ödeme islem basarili oldu");
            return true;
        }

        public String getBankaAdi(){
            return bankaAdi;
        }

        public void setBankaAdi(String bankaAdi){
            this.bankaAdi = bankaAdi;
        }

        public String getTerminalId(){
            return terminalId;
        }

        public void setTerminalId(String terminalId){
            this.terminalId = terminalId;
        }

        public String getPassword(){
            return password;
        }

        public void setPassword(){
            this.password = password;
        }


}
