package StaticAnahtarSozcugu;

public class Main {
    public static void main(String[] args) {

//        Player playerBir = new Player("ahmet", "Cs");
//        Player playerIki = new Player("cagri", "Fm08");
//        System.out.println(playerBir.name + " "  + playerBir.game + " oynar ");
//        playerBir.infoPrint(playerBir);
//        playerIki.infoPrint(playerIki);
//        System.out.println(Player.id);

        Course mat = new Course("matematik", "MAT-101", 70);
        Course fzk = new Course("fizik", "FZK-101", 20);
        Course kmy = new Course("kimya", "KMY-101", 100);
        int[] notlar = {mat.note, fzk.note, kmy.note};
        Course.Calculate(notlar);
        Course [] dersler = {mat, fzk, kmy};
        Course.CalculateDif(dersler);

    }
}
