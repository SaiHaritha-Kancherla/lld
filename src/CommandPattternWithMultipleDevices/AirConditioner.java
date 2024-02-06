package CommandPattternWithMultipleDevices;
//receiver
public class AirConditioner implements Device {
    boolean isOn;
    int temp;
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public void turnOn()
    {
        this.isOn=true;
        System.out.println("Ac is turned on!!!");
    }
    public void turnOff()
    {
        this.isOn=false;
        System.out.println("Ac is turned off!!!");
    }
}
