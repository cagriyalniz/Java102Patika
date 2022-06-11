public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int coin;
    private int originalHealt;

    public Obstacle(int id, String name, int damage, int health, int coin) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.originalHealt = health;
        this.coin = coin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if(health < 0)
            health = 0;
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getOriginalHealt() {
        return originalHealt;
    }

    public void setOriginalHealt(int originalHealt) {
        this.originalHealt = originalHealt;
    }
}
