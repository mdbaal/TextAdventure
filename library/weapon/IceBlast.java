package library.weapon;

public  class IceBlast extends Weapon {
    public  IceBlast() {
        name = "Ice blast";
        level = 1;
        damage = 6 + level;
        manaCost = 3;
    }
}