package CommandPattern;

public class Main {
    public static  void main(String[] args)
    {
        AirConditioner ac=new AirConditioner();
        RemoteControl rc=new RemoteControl();
        rc.setiCommand(new TurnOnACCommand(ac));
        rc.pressButton();

        rc.setiCommand(new TurnOffACCommand(ac));
        rc.pressButton();

        rc.undo();
        rc.undo();
        rc.undo();
    }
}
