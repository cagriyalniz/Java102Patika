import java.util.Scanner;

public class Player {
    //bu özellikler private tanımlanıp dışarıdan erişim engellenerek encapsulate yapılıyor
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner inp = new Scanner(System.in);

    //sadece disaridan alinacak metot constructur fonksiyona yaziliyor
    public Player(String name){
        this.name = name;
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        for(GameChar gameChar : charList){
            System.out.println("ID: " + gameChar.getId() +
                                "\tCharacther: " + gameChar.getName() +
                                "\tDamage: " + gameChar.getDamage() +
                                "\tHealth: " + gameChar.getHealth() +
                                "\tMoney: " + gameChar.getMoney());
        }
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        int slctChar = inp.nextInt();
        switch (slctChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default: initPlayer(new Samurai());
        }

        System.out.println("Karakter olarak " + this.getCharName() + " secildi");
    }

    public void initPlayer(GameChar gameChar){

        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        //this.setName(gameChar.getName()); ?????

    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }


}
