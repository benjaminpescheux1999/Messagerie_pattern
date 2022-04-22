package service;

import java.util.List;

import model.Utilisateur;
import proxy.ListUtilisateurProxy;
import state.AbsentState;
import state.Context;
import state.PresentState;

public class UtilisateurService implements IUtilisateurService {
	public UtilisateurService() {
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
	
	public String login(String pseudo) {
        Context context = new Context();
        String messageConnect;
        String StateConnect;
        if (pseudo=="Admin") {
            messageConnect ="Bonjour "+pseudo+", Vous êtes connecté";
            StateConnect="Valid";
            PresentState presentState = new PresentState();
            presentState.doAction(context);
            System.out.println(context.getState().toString());
        } else {
            // Déclarer l'utilisateur absent
            AbsentState absentState = new AbsentState();
            absentState.doAction(context);
            System.out.println(context.getState().toString());
            messageConnect ="Login incorrect";
            StateConnect="Invalid";
        }
        System.out.println(messageConnect);


        return StateConnect;
    }
}
