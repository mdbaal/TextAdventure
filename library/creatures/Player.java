package library.creatures;

/**
 * Created by mirco on 5/8/2017.
 */

public class Player extends Creature {
        public Player(){
            health = 100;
            mana = 100;
            currentRoom = 0;
        }

        public int GetCurrentRoom(){
            return this.currentRoom;
        }
        public void SetCurrentRoom(int NextRoom){
            this.currentRoom = NextRoom;
        }

        }

