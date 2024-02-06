package ObserverDesignPattern;

import ObserverDesignPattern.Observable.WeatherStation;
import ObserverDesignPattern.Observable.WeatherStationInterface;
import ObserverDesignPattern.Observer.MobilePhoneDisplay;
import ObserverDesignPattern.Observer.TVDisplay;

public class ObserverMainDriver {
    public static  void main(String[] args)
    {
        WeatherStationInterface station=new WeatherStation();
        MobilePhoneDisplay mobilePhoneDisplay=new MobilePhoneDisplay(station);
        TVDisplay tvDisplay=new TVDisplay(station);

        System.out.println(" Add mobile display");
        station.addObserver(mobilePhoneDisplay);
        System.out.println(" change temp");
        station.setData(96);
        System.out.println(" -------------------------------------------------");
        System.out.println(" Add tv display");
        station.addObserver(tvDisplay);
        System.out.println(" change temp");
        station.setData(92);
        System.out.println(" -------------------------------------------------");
        System.out.println(" Remove mobile display");
        station.removeObserver(mobilePhoneDisplay);
        System.out.println("lets change temp");
        station.setData(98);



    }
}
