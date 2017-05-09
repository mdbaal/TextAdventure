package library.weapon;

public class FireBlast extends Weapon {
    public  FireBlast() {
        name = "Fire blast";
        level = 1;
        damage = 6 + level;
        manaCost = 3;
    }
}