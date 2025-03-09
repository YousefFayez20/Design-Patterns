//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        PhoneObserver MyPhone = new PhoneObserver(station);
        TelevisionObserever MyTV = new TelevisionObserever(station);
        station.setMeasurements(45);
        System.out.println("Let's Update the temperature");
        station.setMeasurements(60);

    }
}