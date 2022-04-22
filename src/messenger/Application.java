package messenger;

import java.util.List;

import model.Message;
import service.IMessageService;
import service.MessageService;
import singleton.DbContext;
import state.AbsentState;
import state.Context;
import state.PresentState;

public class Application {
	public static void main(String... args) {
		
		//Singleton context (try catch)
		DbContext db = DbContext.getInstance();
		
		//Connexion
		
		//state (Si connecté change state en présent et passer au proxy)
				Context context = new Context();
				 
				PresentState presentState = new PresentState();
				presentState.doAction(context);
				System.out.println(context.getState().toString());
				 
				AbsentState absentState = new AbsentState();
				absentState.doAction(context);
				 
				System.out.println(context.getState().toString());
		//state sinon break
				
		//Proxy
		IMessageService srvMessage = new MessageService();
		// On rÃ©cupÃ¨re l'instance de la liste, sans la manipuler pour le moment
		List<Message> messages = srvMessage.findAll();
		System.out.println("PAS ENCORE UTILISEE, DONC PAS DE CHARGEMENT ICI");

		// On manipule la liste en demandant sa taille, le chargement se fera Ã  ce moment
		System.out.println(""+messages.size());
		System.out.println("UTILISEE, DONC CHARGEMENT !");
		
		
		
		
		

		
	}
}
