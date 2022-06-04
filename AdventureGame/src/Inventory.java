public class Inventory {
    private Weapon weapon;


    public Inventory() {
        this.weapon = new Weapon("punch", 0, 8, 0);

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
