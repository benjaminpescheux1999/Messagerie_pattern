package service;

import java.util.List;
import model.Message;

public interface IMessageService {
	public List<Message> findAll();
	public Message findById(int id);

}
