package interfaces;

public interface IBanka {

    final String hostIP = "127.0.0.1";
    boolean connect(String IPAdress);
    boolean payment(double price, String cardNumber, String date, String cvc);
}
