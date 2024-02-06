package CommandPattternWithMultipleDevices;

public class Main {
    public static  void main(String[] args)
    {
        AirConditioner ac=new AirConditioner();
        Bulb b=new Bulb();
        RemoteControl rc=new RemoteControl();
        rc.setiCommand(new TurnOnCommand(ac));
        rc.pressButton();
        rc.setiCommand(new TurnOnCommand(b));
        rc.pressButton();

        rc.setiCommand(new TurnOffCommand(ac));
        rc.pressButton();
        rc.setiCommand(new TurnOffCommand(b));
        rc.pressButton();

        rc.undo();
        rc.undo();
        rc.undo();
        rc.undo();
        rc.undo();
        rc.undo();
    }
}
