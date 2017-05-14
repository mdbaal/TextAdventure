package library.actions;

/**
 * Created by mirco on 5/14/2017.
 */
public class Commands {

    private static final String Commands[] = {"go", "look", "check", "fight"};

    Commands(){


    }

    public void listWords(){
        System.out.print("Available commands are: ");
        for (int c = 0;c < Commands.length; c++){
            System.out.print(Commands[c] + " ");
        }
        System.out.println();
    }
    public boolean isCommand(String input){
        for(int c = 0;c <Commands.length;c++){
            if(input.equals(Commands[c])){
                return true;
            }
        }
        return false;
    }

}
