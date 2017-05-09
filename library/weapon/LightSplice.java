package library.weapon;

public  class LightSplice extends Weapon {
    public  LightSplice() {
        name = "Light splice";
        level = 1;
        damage = 10 + level;
        manaCost = 10;
    }
}