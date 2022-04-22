package service;

import java.util.List;

import model.Conversation;

public interface IConversationService {
	public List<Conversation> findAll();
	public Conversation findById(int id);
}
