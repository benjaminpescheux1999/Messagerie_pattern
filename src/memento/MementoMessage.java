package memento;


import model.Message;
import model.Utilisateur;

public class MementoMessage {

	private int id;
	private String message;
	private Utilisateur emetteur;
	private Utilisateur destinataire;
	
	public MementoMessage(Message message) {
		this.id = message.getId();
		this.message = message.getMessage();
		this.emetteur = message.getEmetteur();
		this.destinataire = message.getDestinataire();
	}

	public void restore(Message message) {
		message.setId(this.id);
		message.setMessage(this.message);
		message.setEmetteur(this.emetteur);
		message.setDestinataire(this.destinataire);
	}
}
