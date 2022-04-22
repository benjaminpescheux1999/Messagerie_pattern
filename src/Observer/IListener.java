package Observer;

public interface IListener {
	public void update(IObservable target, Object ctx);
}
