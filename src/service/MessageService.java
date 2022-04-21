package service;

import java.util.ArrayList;
import java.util.List;

public class MessageService implements IMessageService{
	public MessageService() {
		System.out.println("CREATION PRODUIT SERVICE V2");
	}

	public List<Message> findAll() {
		System.out.println("FIND ALL V2");
		return new ArrayList<>();
	}

	public Message findById(int id) {
		System.out.println("FIND BY ID " + id + " V2");
		return new Message();
	}
}
