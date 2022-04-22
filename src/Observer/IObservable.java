package Observer;

public interface IObservable {
	public void attach(IListener listener);
	public void detach(IListener listener);
	public void alert(Object ctx);
}
