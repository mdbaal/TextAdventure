package main;

import library.actions.Parser;
import library.player.Player;
import library.rooms.Room;
import library.rooms.StartRoom;

import java.util.HashMap;


/**
 * Created by mirco on 5/9/2017.
 */

public class Game {
    Player player = new Player();
    Parser parser = new Parser();

    public void start(){
        createGame();
    }


    void createGame(){
        for(int r = 0;r < 3;r++){
            Room room = new Room();
        }
    }
}

