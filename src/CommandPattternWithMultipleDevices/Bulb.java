package CommandPattternWithMultipleDevices;

public class Bulb  implements  Device{
    boolean isOn;
    int temp;
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public void turnOn()
    {
        this.isOn=true;
        System.out.println("Bulb is turned on!!!");
    }
    public void turnOff()
    {
        this.isOn=false;
        System.out.println("Bulb is turned off!!!");
    }
}
