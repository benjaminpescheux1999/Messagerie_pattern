//Singleton
package singleton;

public class DbContext {
	private static final DbContext instance = new DbContext();

	public DbContext() { }

	public static DbContext getInstance() {
		// Possible d'y ajouter une condition pour vérifier si l'instance existe
		// > Et y associer des paramètres
		// > Uniquement si l'instance n'est pas une constante

		// if (instance == null) {
			// instance = new DbContext();
			// Autres paramètres ...
		// }
			System.out.println("Connexion � la BDD !!!");
		return instance;
	}
}