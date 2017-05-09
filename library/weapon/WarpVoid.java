package library.weapon;


public  class WarpVoid extends Weapon {
    public  WarpVoid() {
        name = "Warp void";
        level = 1;
        damage = 5 + level;
        manaCost = 3;
    }
}