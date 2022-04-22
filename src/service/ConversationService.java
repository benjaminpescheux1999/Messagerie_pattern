package service;

import java.util.List;

import model.Conversation;
import proxy.ListConversationProxy;

public class ConversationService {
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
