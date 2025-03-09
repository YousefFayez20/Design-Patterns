public interface IObserverable {
    public void register(IObserver o);
    public void delete(IObserver o);
    public void Notify();
}
