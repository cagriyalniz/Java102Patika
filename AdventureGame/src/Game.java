import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to Adventure Game");
        System.out.print("Please write your name: ");
        String playerName = input.nextLine();

        Player player = new Player(playerName);
        System.out.println("Adventure is starting for " +player.getName());
        System.out.println("choose your warrior ID: ");
        player.selectChar();
    }
}
