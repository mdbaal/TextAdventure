package library.player;

import library.items.*;

/**
 * Created by mirco on 5/8/2017.
 */

public class Player {

    int health;
    int mana;
    int currentRoom;



    String name = "John";



    Item[] inventory;


    public Player(){
        health = 100;
        mana = 100;
        currentRoom = 0;
        inventory = new Item[4];

    }

    public Item GetInventory(int inventorySpot) {
        return inventory[inventorySpot];
    }
    public String GetName() {
        return name;
    }

    public int GetCurrentRoom(){
        return this.currentRoom;
    }
    public void SetCurrentRoom(int NextRoom){
        this.currentRoom = NextRoom;
    }

}

