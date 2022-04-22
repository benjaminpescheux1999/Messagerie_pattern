package service;

import java.util.List;

import model.Utilisateur;
import proxy.ListUtilisateurProxy;

public class UtilisateurService implements IUtilisateurService {
	public UtilisateurService() {
		System.out.println("CREATION Utilisateur");
	}

	//public List<Message> findAll() {
		//System.out.println("FIND ALL Message");
		//return new ArrayList<>();
	//}

	public Utilisateur findById(int id) {
		System.out.println("FIND BY ID " + id);
		return new Utilisateur();
	}
	public List<Utilisateur> findAll() {
		System.out.println("FIND ALL");
		//this.alert(); // On informe les listeners
		return new ListUtilisateurProxy();
	}
	/*@Override
	public void alert() {
		this.listeners.forEach(l -> l.update(this));
	}*/
}
