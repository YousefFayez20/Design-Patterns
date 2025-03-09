import java.util.ArrayList;
import java.util.List;

public class WeaterStation implements IObserverable {

    private double temperature;

    List<IObserver> observers;
    public WeaterStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(IObserver o) {
observers.add(o);
    }

    @Override
    public void delete(IObserver o) {
        observers.remove(o);

    }

    @Override
    public void Notify() {
        for(IObserver o : observers){
            o.Update(temperature);
        }
    }
    public void setMeasure(double Temp){
        temperature = Temp;
        Notify();
    }


}
