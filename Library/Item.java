package Library;

/**
 * Created by mirco on 5/8/2017.
 */
public class Item {
    //general variables\\
    public String name;
    public String description;

    //item specific variables\\
    public int amount;
    public int healthRes;
    public int manaRes;

}



    //general items\\
    class Hpotion extends Item{
    Hpotion(){
        name = "Health potion";
        amount = 1;
        healthRes = 5;
    }
}
class Mpotion extends Item{
    Mpotion() {
        name = "Mana potion";
        amount = 1;
        manaRes = 5;
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
        healthRes = 2;
    }
}
class Water extends Item{
    Water() {
        name = "Water";
        amount = 1;
        healthRes = 2;
    }
}


