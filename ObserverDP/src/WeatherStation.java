import java.util.List;
import java.util.ArrayList;
public class WeatherStation  implements IObservable{
    private List<Observer> ObserversList;
    private double temperature;

    public WeatherStation() {
        ObserversList = new ArrayList<>(); // Initialize the list
    }
    @Override
    public void addObserver(Observer o) {

        ObserversList.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
     ObserversList.remove(o);
    }

    @Override
    public void NotifyObservers() {

        for(Observer o : ObserversList) {
            o.Update(temperature);
        }
    }
    public void setMeasurements(double temp){
        this.temperature = temp;
        NotifyObservers();
    }
}
