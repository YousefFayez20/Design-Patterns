public class TelevisionObserever implements Observer{

    IObservable Myobservable;
    private double temperature;

    public TelevisionObserever(IObservable o) {
        Myobservable = o;
        Myobservable.addObserver(this);

    }

    @Override
    public void Update(double Temperature) {

        temperature = Temperature;
        System.out.println("TV Updated Current conditions: " + temperature);
    }
    }

