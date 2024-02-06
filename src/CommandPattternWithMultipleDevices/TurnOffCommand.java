package CommandPattternWithMultipleDevices;

public class TurnOffCommand implements ICommand {
    Device device;
    public TurnOffCommand(Device device)
    {
        this.device=device;
    }
    @Override
    public void exceute() {
        this.device.turnOff();
    }

    @Override
    public void undo() {
        this.device.turnOn();
    }
}
