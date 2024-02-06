package CommandPattern;

public class TurnOnACCommand implements  ICommand{
    AirConditioner ac;
    TurnOnACCommand(AirConditioner ac)
    {
        this.ac=ac;
    }
    @Override
    public void exceute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
