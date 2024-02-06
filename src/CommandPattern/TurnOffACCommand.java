package CommandPattern;

public class TurnOffACCommand implements ICommand{
    AirConditioner ac;
    public TurnOffACCommand(AirConditioner ac)
    {
        this.ac=ac;
    }
    @Override
    public void exceute() {
        this.ac.turnOff();
    }

    @Override
    public void undo() {
        this.ac.turnOn();
    }
}
