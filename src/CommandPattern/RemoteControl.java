package CommandPattern;
import java.util.Stack;
//Invoker
public class RemoteControl {
    ICommand iCommand;
    Stack<ICommand> commandHistory=new Stack<>();
    public void setiCommand(ICommand iCommand)
    {
        this.iCommand=iCommand;
    }
    public void pressButton()
    {
        this.iCommand.exceute();
        this.commandHistory.add(this.iCommand);
    }
    public void undo()
    {
        if(!(this.commandHistory.isEmpty()))
        {
            ICommand lastExcutedCmnd=this.commandHistory.pop();
            lastExcutedCmnd.undo();
        }
        else
        {
            System.out.println("Nothing is there to undo");
        }
    }
}
