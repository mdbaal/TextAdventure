package library;

/**
 * Created by mirco on 5/8/2017.
 */

	//Weapons\\
	public class Weapon {
        //general variables\\
        protected String name;
        public int level;

        //weapon specific variables\\
        public int damage;
        public int block;
        public int durability;
        public int minDurability;
        public int manaCost;

        class Sword extends Weapon {
            Sword() {
                name = "Sword";
                level = 1;
                damage = 5 + level;
                durability = 50;
                minDurability = 3 - level * -1;
            }
        }

        class Shield extends Weapon {
            Shield() {
                name = "Shield";
                level = 1;
                block = 3 + level;
                durability = 50;
                minDurability = 5 - level * -1;
            }
        }

        class Bow extends Weapon {
            Bow() {
                name = "Bow";
                level = 1;
                damage = 7 + level;
                durability = 50;
                minDurability = 8 - level * -1;
            }
        }

        //Spells\\
        class FireBlast extends Weapon {
            FireBlast() {
                name = "Fire blast";
                level = 1;
                damage = 6 + level;
                manaCost = 3;
            }
        }

        class IceBlast extends Weapon {
            IceBlast() {
                name = "Ice blast";
                level = 1;
                damage = 6 + level;
                manaCost = 3;
            }
        }

        class LightSplice extends Weapon {
            LightSplice() {
                name = "Light splice";
                level = 1;
                damage = 10 + level;
                manaCost = 10;
            }
        }

        class WarpVoid extends Weapon {
            WarpVoid() {
                name = "Warp void";
                level = 1;
                damage = 5 + level;
                manaCost = 3;
            }
        }
    }


