package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.WeatherStationInterface;

public class TVDisplay implements ObserverInterface{
    WeatherStationInterface obj;
    public TVDisplay(WeatherStationInterface obj)
    {
        this.obj=obj;
    }

    @Override
    public void update() {
        System.out.println("weather update in tv"+ this.obj.getData());
    }
}
