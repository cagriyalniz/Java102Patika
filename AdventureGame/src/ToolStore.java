public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation(){
        boolean showMenu = true;
        System.out.println("Welcome to Store!");
        while(showMenu){
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
                    buyArmor();
                    break;
                case 3:
                    System.out.println("See you!");
                    showMenu = false;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---------Weapon--------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " " + w.getName() + "\tPrice: " + w.getPrice() + " damage: " + w.getDamage());
        }
        System.out.println("press 0 for exit");
    }

    public void buyWeapon(){
        System.out.print("choose a gun: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Wrong, Try Again!!");
            selectWeaponID = input.nextInt();
        }
        if(selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Your mones is less than this item :( ");
                } else {
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
    }
    public void printArmor(){
        System.out.println("----------Z-I-R-H-L-A-R-----------");
        for(Armor a : Armor.armors()){
            System.out.println(a.getId() + "." + a.getName() + " price: " +
                                a.getPrice() + " block: " + a.getBlock());
        }
        System.out.println("press 0 for exit");
    }

    public void buyArmor(){
        System.out.print("Choose an armor: ");
        int selectArmorID = input.nextInt();

        while(selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.print("this is not an armor! try again! ");
            selectArmorID = input.nextInt();
        }
        if(selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if(selectedArmor != null){
                if(selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("You are not rich!");
                }
                else{
                    System.out.println("you buy this armor: " + selectedArmor.getName());
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();//encapsulating yapildigi
                    //icin this.get.player seklinde cagirmak gerekiyor. direkt player cagiralamaz
                    this.getPlayer().setMoney(balance);
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("your money: " + this.getPlayer().getMoney());
                }
            }
        }

    }
}
