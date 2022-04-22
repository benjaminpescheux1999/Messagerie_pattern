package service;

import java.util.ArrayList;
import java.util.List;

import model.Message;
import proxy.ListMessageProxy;

public class MessageService implements IMessageService{
	public MessageService() {
		
	}

	//public List<Message> findAll() {
		//System.out.println("FIND ALL Message");
		//return new ArrayList<>();
	//}

	public Message findById(int id) {

		return new Message();
	}
	public List<Message> findAll() {
		//this.alert(); // On informe les listeners
		return new ListMessageProxy();
	}
	/*@Override
	public void alert() {
		this.listeners.forEach(l -> l.update(this));
	}*/

	@Override
	public void save(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Le message " + message.getMessage() + " a été sauvegardé.");
		
	}
}
