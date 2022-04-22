package messenger;

import java.util.List;
import java.util.concurrent.ExecutionException;

import Decorator.MessageServiceDecorator;
import memento.MementoManager;
import model.Message;
import model.Utilisateur;
import service.IMessageService;
import service.IUtilisateurService;
import service.MessageService;
import service.UtilisateurService;
import singleton.DbContext;
import state.AbsentState;
import state.Context;
import state.PresentState;

public class Application {
	public static void main(String... args) throws Exception {
		
		MessageServiceDecorator srvMessage = new MessageServiceDecorator();
		MementoManager mementoManager = new MementoManager();
		Message message= srvMessage.findById(1);
		
		// Création de 2 utilisateurs
		Utilisateur utilisateur1  = new Utilisateur();
		Utilisateur utilisateur2  = new Utilisateur();
		
		utilisateur1.setId(1);
		utilisateur1.setPseudo("Benjamin");
		utilisateur2.setId(2);
		utilisateur2.setPseudo("Matthieu");
		
		srvMessage.attach(mementoManager);
		
		
		try {
			//Utilisation du singleton pour se connecter à la bdd
            DbContext db = DbContext.getInstance();
            //Connexion de l'utilisateur
            IUtilisateurService srvUtilisateur = new UtilisateurService();
            if (srvUtilisateur.login("Admin")=="Valid") {
            	//L'utilisateur envoie plusieurs messages
            	message.setMessage("Salut");
        		message.setEmetteur(utilisateur1);
        		message.setDestinataire(utilisateur2);
        		
        		srvMessage.save(message).get();
        		
        		message.setMessage("MANGER");
        		message.setEmetteur(utilisateur1);
        		message.setDestinataire(utilisateur2);
        		
        		srvMessage.save(message).get();
        		
        		message.setMessage("VITE !");
        		message.setEmetteur(utilisateur1);
        		message.setDestinataire(utilisateur2);
        		
        		srvMessage.save(message).get();
        		
        		//L'utilisateur utilise les flèches afin de récupérer les messages précédemment envoyés
        		mementoManager.mementoPrecedent(message);
        		System.out.println(message.getMessage());

        		mementoManager.mementoSuivant(message);
        		System.out.println(message.getMessage());

            }
        }catch(Exception e) {
            System.out.println("error"+e);
        }
		
	}
}
