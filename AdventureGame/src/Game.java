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
            System.out.println("3- Cave: You will find water ");
            System.out.println("4- Forrest: You will find fruit & meat ");
            System.out.println("5- Caste: You will find wine ");
            System.out.println("0- End of Game ");
            System.out.println("Choose location! ");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forrest(player);
                    break;
                case 5:
                    location = new Castle(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if(location == null){
                System.out.println("THE END");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over!!!");
                break;
            }
        }

    }
}
