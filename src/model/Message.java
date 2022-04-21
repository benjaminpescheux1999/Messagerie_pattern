package model;

public class Message {

	private int id;
	private String message;
	private Utilisateur emetteur;
	private Utilisateur destinataire;
	private Conversation conversation;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Utilisateur getEmetteur() {
		return emetteur;
	}
	public void setEmetteur(Utilisateur emetteur) {
		this.emetteur = emetteur;
	}
	public Utilisateur getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(Utilisateur destinataire) {
		this.destinataire = destinataire;
	}
	public Conversation getConversation() {
		return conversation;
	}
	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}
	
	
	
}
