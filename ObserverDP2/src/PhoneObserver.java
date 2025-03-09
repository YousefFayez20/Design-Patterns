public class PhoneObserver implements IObserver{

    IObserverable observable;
    private double temperature;

    public PhoneObserver(IObserverable observable) {
        this.observable = observable;
        observable.register(this);
    }

    @Override
    public void Update(double temp) {
        temperature = temp;
        System.out.println("temp");
    }
}
