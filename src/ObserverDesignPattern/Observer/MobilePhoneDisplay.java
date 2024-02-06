package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.WeatherStationInterface;

public class MobilePhoneDisplay implements ObserverInterface {
    WeatherStationInterface obj;
    public MobilePhoneDisplay(WeatherStationInterface obj)
    {
        this.obj=obj;
    }
    @Override
    public void update() {
        System.out.println("weather update in mobile "+ this.obj.getData());
    }
}
