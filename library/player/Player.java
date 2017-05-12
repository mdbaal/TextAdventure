package library.player;

import library.items.*;

/**
 * Created by mirco on 5/8/2017.
 */

public class Player {

    int health;
    int mana;
    int currentRoom;
    int x;
    int y;

    String name = "John";

    Item[] inventory;

    public Player(){
        health = 100;
        mana = 100;
        currentRoom = 0;
        inventory = new Item[4];

        x = 0;
        y = 0;
    }

    public Item getInventory(int inventorySpot) {
        return inventory[inventorySpot];
    }
    public String getName() {
        return name;
    }

    public int getCurrentRoom(){
        return this.currentRoom;
    }
    public void setCurrentRoom(int NextRoom){
        this.currentRoom = NextRoom;
    }

}

