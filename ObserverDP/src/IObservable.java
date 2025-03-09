public interface IObservable {
    public void addObserver(Observer o);
    public void RemoveObserver(Observer o);
    public void NotifyObservers();
}
