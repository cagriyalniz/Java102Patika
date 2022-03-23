package StaticAnahtarSozcugu;

public class Player {

    public String name;
    public static int id = 1;
    public String game;

    public Player(String name, String game)
    {
        this.name = name;
        this.game = game;

    }

    public void infoPrint(Player player){
        System.out.println("id numarasi " + player.id + " olan " + player.name + " " +player.game +  " oyunun oynar" );
        id++;
    }
}
