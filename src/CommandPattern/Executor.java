package CommandPattern;

import java.util.ArrayList;

public class Executor {
    ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeAll(){
        for(Command command : commands){
            command.execute();
        }
    }
}
