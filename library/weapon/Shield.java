package library.weapon;

public class Shield extends Weapon {
    public Shield() {
        name = "Shield";
        level = 1;
        block = 3 + level;
        durability = 50;
        minDurability = 5 - level * -1;
    }
}