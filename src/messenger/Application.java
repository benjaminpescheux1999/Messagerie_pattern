package messenger;

import java.util.List;

import model.Message;
import service.IMessageService;
import service.MessageService;
import singleton.DbContext;

public class Application {
	public static void main(String... args) {
		//Singleton context
		DbContext db = DbContext.getInstance();
		System.out.println(db);

		//Proxy
		IMessageService srvProduit = new MessageService();

		// On récupère l'instance de la liste, sans la manipuler pour le moment
		List<Message> messages = srvMessage.findAll();
		System.out.println("PAS ENCORE UTILISEE, DONC PAS DE CHARGEMENT ICI");

		// On manipule la liste en demandant sa taille, le chargement se fera à ce moment
		System.out.println(messages.size());
		System.out.println("UTILISEE, DONC CHARGEMENT !");

		
	}
}
