public class PhoneObserver implements Observer{
    IObservable Myobservable;
    private double temperature;

    public PhoneObserver(IObservable o) {
        Myobservable = o;
        Myobservable.addObserver(this);

    }

    @Override
    public void Update(double Temperature) {

        temperature = Temperature;
        System.out.println("Phone Updated Current conditions: " + temperature);
    }

}
