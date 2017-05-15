package library.player;

import library.rooms.*;
import library.items.*;

/**
 * Created by mirco on 5/8/2017.
 */

public class Player {

    int health;
    int mana;

    int x;
    int y;

    String name = "John";

    Room currentRoom;

    Item[] inventory;

    public Player(){
        health = 100;
        mana = 100;

        inventory = new Item[4];


        isAlive();
    }

    public Item getInventory(int inventorySpot) {
        return inventory[inventorySpot];
    }
    public String getName() {
        return name;
    }

    void damage(int amount){
        this.health -= amount;
    }

    void heal(int amount){
        this.health += amount;
    }

    Boolean isAlive(){
        Boolean alive = null;
        if(this.health > 0){
            alive =  true;
        }else {
            alive = false;
        }
        return alive;
    }


    public void setCurrentRoom(Room room){
        this.currentRoom = room;
        //movePlayer(currentRoom.getX(),currentRoom.getY());
    }

}

