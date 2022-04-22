package model;

import java.util.List;

public class Conversation {

	private int id;
	private List<Utilisateur> utilisateurs;
	private List<Message> messages;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurs;
	}
	
	public List<Message> getAllMessages() {
		return messages;
	}
	
	public List<Message> getAllMessageByUser(int idUtilisateur){
		List<Message> result = null;
		
		for(Message m : messages) {
			if(m.getEmetteur().getId() == idUtilisateur) {
				result.add(m);
			}	
		}
		
		return result;
	}
	
	public void addMessage(Message message) {
		this.messages.add(message);
	}
	
	public void addUtilisateur(Utilisateur utilisateur) {
		this.utilisateurs.add(utilisateur);
	}
	
}
