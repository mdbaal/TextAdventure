package library.weapon;

public  class Bow extends Weapon {
    public   Bow() {
        name = "Bow";
        level = 1;
        damage = 7 + level;
        durability = 50;
        minDurability = 8 - level * -1;
    }
}