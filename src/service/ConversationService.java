package service;

import java.util.List;

import model.Conversation;
import model.Message;
import proxy.ListConversationProxy;
import proxy.ListMessageProxy;

public class ConversationService {
	public ConversationService() {
		System.out.println("CREATION Conversation");
	}

	//public List<Message> findAll() {
		//System.out.println("FIND ALL Message");
		//return new ArrayList<>();
	//}

	public Conversation findById(int id) {
		System.out.println("FIND BY ID " + id);
		return new Conversation();
	}
	public List<Conversation> findAll() {
		System.out.println("FIND ALL");
		//this.alert(); // On informe les listeners
		return new ListConversationProxy();
	}
}
