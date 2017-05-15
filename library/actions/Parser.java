package library.actions;


        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;


/**
 * Created by mirco on 5/14/2017.
 */
public class Parser {

    Commands commands = new Commands();

    public Parser(){
        commands.listWords();
       // getCommand();
    }

    public void getCommand(){
        String input = "";
        String word1;
        String word2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            input = reader.readLine();
        }
        catch(IOException exc){
            System.out.println ("There was an error during reading: "
                    + exc.getMessage());


        }
    }
}

