package ObserverDesignPattern.Observable;
import ObserverDesignPattern.Observer.ObserverInterface;
import java.util.ArrayList;
import java.util.List;

//notify me if product comes as in stock from out of stock
// observable will notify state changes of it to all the multple observers about its state change
public class WeatherStation  implements WeatherStationInterface{
    int tempData;
    List<ObserverInterface> observerList=new ArrayList<ObserverInterface>();
    @Override
    public void addObserver(ObserverInterface observerInterface) {
        this.observerList.add(observerInterface);
    }

    @Override
    public void removeObserver(ObserverInterface observerInterface) {
        this.observerList.remove(observerInterface);
    }

    @Override
    public void notifyObserver() {
        for( ObserverInterface observerInterface : observerList)
        {
            observerInterface.update();
        }
    }

    @Override
    public int getData() {
        return this.tempData;
    }

    @Override
    public void setData(int newTempData) {
        this.tempData=newTempData;
        this.notifyObserver();
    }
}
