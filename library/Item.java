package library;

/**
 * Created by mirco on 5/8/2017.
 */
public class Item {
    //general variables\\
    public String name;
    public String description;

    //item specific variables\\
    public int amount;
    public int healthRegen;
    public int manaRegen;

}



    //general items\\
    class HealthPotion extends Item{
    HealthPotion(){
        name = "Health potion";
        amount = 1;
        healthRegen = 5;
    }
}
class ManaPotion extends Item{
    ManaPotion() {
        name = "Mana potion";
        amount = 1;
        manaRegen = 5;
    }
}
class GoldCoin extends Item{
    GoldCoin() {
        name = "Gold coin";
        amount = 1;
    }
}
class Bread extends Item{
    Bread() {
        name = "Bread";
        amount = 1;
        healthRegen = 2;
    }
}
class Water extends Item{
    Water() {
        name = "Water";
        amount = 1;
        healthRegen = 2;
    }
}


