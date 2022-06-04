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
        Location location = null;
        while(true){
            System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
            player.printInfo();
            System.out.println("Location: ");
            System.out.println("1- Safe House ");
            System.out.println("2- Store ");
            System.out.println("Choose location! ");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if(!location.onLocation()){
                System.out.println("Game Over!!!");
                break;
            }
        }

    }
}
