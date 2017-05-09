package library.weapon;

/**
 * Created by mirco on 5/9/2017.
 */
public class Sword extends Weapon{
        public  Sword() {
            name = "Sword";
            level = 1;
            damage = 5 + level;
            durability = 50;
            minDurability = 3 - level * -1;
        }
}

