public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Welcome to Store!");
        System.out.println("1- Weapon ");
        System.out.println("2- Armor ");
        System.out.println("3- Exit!");
        int selectCase = input.nextInt();
        while(selectCase < 1 || selectCase > 3){
            System.out.print("Wrong number");
            selectCase = input.nextInt();
        }

        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("See you!");
                return true;
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---------Weapon--------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " " + w.getName() + "\tPrice: " + w.getPrice() + " damage: " + w.getDamage());
        }
    }

    public void buyWeapon(){
        System.out.print("choose a gun: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Wrong, Try Again!!");
            selectWeaponID = input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
        if(selectedWeapon != null){
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Your mones is less than this item :( ");
            }
            else{
                //buy
                System.out.println(selectedWeapon.getName() + " bought :)");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Your money is: " + this.getPlayer().getMoney());
                System.out.println("old weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("new weapon: " + this.getPlayer().getInventory().getWeapon().getName());

            }
        }

    }
    public void printArmor(){
        System.out.println("");
    }
}
