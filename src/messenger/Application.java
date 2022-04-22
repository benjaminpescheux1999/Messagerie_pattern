package messenger;

import java.util.List;

import model.Message;
import service.IMessageService;
import service.IUtilisateurService;
import service.MessageService;
import service.UtilisateurService;
import singleton.DbContext;
import state.AbsentState;
import state.Context;
import state.PresentState;

public class Application {
	public static void main(String... args) {
		
		//Singleton context (try catch)
		//Connexion bdd
		DbContext db = DbContext.getInstance();
		// D�clarer l'utilisateur absent
		Context context = new Context();
		AbsentState absentState = new AbsentState();
		absentState.doAction(context);
		System.out.println(context.getState().toString());
		//Connexion
		IUtilisateurService srvUtilisateur = new UtilisateurService();
		System.out.println(srvUtilisateur.login("Benjamin"));
		//System.out.println("Utilisateur connect�");

		//state (Si connect� change state en pr�sent et passer au proxy)			 
		PresentState presentState = new PresentState();
		presentState.doAction(context);
		System.out.println(context.getState().toString());
				 
								
		//Proxy
		IMessageService srvMessage = new MessageService();
		// On récupère l'instance de la liste, sans la manipuler pour le moment
		List<Message> messages = srvMessage.findAll();
		System.out.println("PAS ENCORE UTILISEE, DONC PAS DE CHARGEMENT ICI");

		// On manipule la liste en demandant sa taille, le chargement se fera à ce moment
		System.out.println(""+messages.size());
		System.out.println("UTILISEE, DONC CHARGEMENT !");
		
		
		
		
		

		
	}
}
