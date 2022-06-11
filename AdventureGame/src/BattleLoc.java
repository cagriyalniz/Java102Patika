import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    public String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    public int randObstacleNumber(){
        Random r = new Random();
        return  r.nextInt(this.getMaxObstacle()) + 1;
    }

    @Override
    boolean onLocation() {
        int obsNumber = this.randObstacleNumber();
        System.out.println("you are in the " + this.getName() );
        System.out.println("Be Careful!! " + obsNumber + " " +
                this.obstacle.getName() + " sleeps in here!" );
        System.out.println("<F>ight or <R>un! ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("F")){
            System.out.println(this.obstacle.getName() + " wil kill you! ");
            if(combat((obsNumber))){
                System.out.println("there is any " + this.getObstacle().getName() + " in "+ this.getName());
                return true;
            }
        }
        if(this.getPlayer().getHealth() <= 0){
            System.out.println("YOU ARE DIE");
            return false;
        }
        else if(selectCase.equals("R")){
            System.out.println("Ha Ha Ha ! You are afraid");
            return true;
        }

        return true;
    }

    public boolean combat(int obsNumber){
        if(obsNumber < 2){
            System.out.println(obsNumber + this.getObstacle().getName() + " is waiting for you :)");
        }
        else{
            System.out.println(obsNumber + this.getObstacle().getName() + " are waiting for you :)))");
        }
        for(int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealt());
            playerStats();
            obstacleStats(i);
            while(this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<A>ttack or <R>un");
                String selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("A")){
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println("next attack is coming from : " + this.getObstacle().getName() + " be careful!" );
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }
                else{
                    return false;
                }
            }
            if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Enemies are death");
                System.out.println("you win " +this.getObstacle().getCoin() + " coins");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getCoin());
                System.out.println("your money acoount is: " + this.getPlayer().getMoney());
            }
            else{
                return false;
            }

        }

        return true;
    }

    public void afterHit(){
        System.out.println("Your health: " + this.getPlayer().getHealth() );
        System.out.println(this.getObstacle().getName() + " health: " + this.getObstacle().getHealth());
        System.out.println(". . . . . ..... . . . . ..... . . . . ..... . . . . .");

    }

    public void playerStats() {
        System.out.println("           Your informations: ");
        System.out.println("--------------------------------------------------");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Money: " + this.getPlayer().getMoney());
        if (this.getPlayer().getInventory().getArmor().getId() > 0){
            System.out.println("your armor is: " + this.getPlayer().getInventory().getArmor().getName());
        }
        else{
            System.out.println("your armor is your hand!!");
        }
        if(this.getPlayer().getInventory().getWeapon().getId() > 0){
            System.out.println("your weapon is : " + this.getPlayer().getWeapon().getName());
        }
        else{
            System.out.println("your armor is your hand. i hope you know the Ottoman Slaps");
        }
        System.out.println("Block : " + this.getPlayer().getInventory().getArmor().getBlock());
    }

    public void obstacleStats(int i){
        System.out.println(i + ". " + this.getObstacle().getName());
        System.out.println("health: " + this.getObstacle().getHealth());
        System.out.println("damage: " + this.getObstacle().getDamage());
        System.out.println("coin: " + this.getObstacle().getCoin());
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
