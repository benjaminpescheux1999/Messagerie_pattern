package service;

import java.util.List;

import model.Conversation;
import model.Utilisateur;

public interface IUtilisateurService {
	public List<Utilisateur> findAll();
	public Utilisateur findById(int id);
}
