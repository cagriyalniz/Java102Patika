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
        if(selectCase.equals("S")){
            System.out.println(this.obstacle.getName() + " wil kill you! ");
            //Fight
        }
        else if(selectCase.equals("R")){
            System.out.println("Ha Ha Ha ! You are afraid");
        }
        return true;
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
