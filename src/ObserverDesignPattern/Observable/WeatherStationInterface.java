package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.ObserverInterface;

import java.util.Observer;

public interface WeatherStationInterface {

    public void addObserver(ObserverInterface observerInterface);
    public void removeObserver(ObserverInterface observerInterface);
    public void notifyObserver();
    public int getData();
    public void setData(int newTempData);

}
