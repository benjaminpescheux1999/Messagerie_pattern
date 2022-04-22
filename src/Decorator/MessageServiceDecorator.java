package Decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import Observer.IListener;
import Observer.IObservable;
import model.Message;
import service.MessageService;

public class MessageServiceDecorator implements IObservable{

	private MessageService srvMessage = new MessageService();
	private List<IListener> listeners = new ArrayList<>();
	
	public List<Message> findAll() {
		return this.srvMessage.findAll();
	}
	
	public Message findById(int id) {
		return this.srvMessage.findById(id);
	}
	
	public Future<Void> save(Message message) {
		ExecutorService threadpool = Executors.newCachedThreadPool();

		return threadpool.submit(() -> {
			try {
				Thread.sleep(2000);
				this.srvMessage.save(message);
				this.alert(message);
			}
			
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			return null;
		});
	}
	
	
	@Override
	public void attach(IListener listener) {
		// TODO Auto-generated method stub
		this.listeners.add(listener);
	}

	@Override
	public void detach(IListener listener) {
		// TODO Auto-generated method stub
		this.listeners.remove(listener);
	}

	@Override
	public void alert(Object ctx) {
		// TODO Auto-generated method stub
		this.listeners.forEach(l -> l.update(this, ctx));
	}

	
}
