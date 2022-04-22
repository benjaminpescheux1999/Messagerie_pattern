package service;

import java.util.ArrayList;
import java.util.List;

import model.Message;
import proxy.ListMessageProxy;

public class MessageService implements IMessageService{
	public MessageService() {
		System.out.println("CREATION Message");
	}

	//public List<Message> findAll() {
		//System.out.println("FIND ALL Message");
		//return new ArrayList<>();
	//}

	public Message findById(int id) {
		System.out.println("FIND BY ID " + id);
		return new Message();
	}
	public List<Message> findAll() {
		System.out.println("FIND ALL");
		//this.alert(); // On informe les listeners
		return new ListMessageProxy();
	}
	/*@Override
	public void alert() {
		this.listeners.forEach(l -> l.update(this));
	}*/
}
