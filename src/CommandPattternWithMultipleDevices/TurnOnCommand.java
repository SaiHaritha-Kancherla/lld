package CommandPattternWithMultipleDevices;

public class TurnOnCommand implements ICommand {
    Device device;
    TurnOnCommand(Device device)
    {
        this.device=device;
    }
    @Override
    public void exceute() {
        this.device.turnOn();
    }

    @Override
    public void undo() {
        this.device.turnOff();
    }
}
