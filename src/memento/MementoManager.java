package memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Message;



public class MementoManager {

	private Map<Integer, List<MementoMessage>> MementoMessages = new HashMap<>();
	private int currentMessageIndex = -1;

	public void ajouterMemento(Message message) {
		if (!this.MementoMessages.containsKey(message.getEmetteur().getId())) {
			this.MementoMessages.put(message.getEmetteur().getId(), new ArrayList<>());
		}

		List<MementoMessage> mementos = this.MementoMessages.get(message.getEmetteur().getId());

		while (mementos.size() - 1 > currentMessageIndex) {
			mementos.remove(mementos.size() - 1);
		}

		mementos.add(new MementoMessage(message));
		currentMessageIndex++;

		if (mementos.size() > 5) {
			mementos.remove(0);
		}
	}

	public void mementoPrecedent(Message Message) {
		if (this.MementoMessages.containsKey(Message.getEmetteur().getId())) {
			List<MementoMessage> mementos = this.MementoMessages.get(Message.getEmetteur().getId());
			
			System.out.println("Message Précédent");
			mementos.get(--currentMessageIndex).restore(Message);
		}
	}

	public void mementoSuivant(Message Message) {
		if (this.MementoMessages.containsKey(Message.getEmetteur().getId())) {
			List<MementoMessage> mementos = this.MementoMessages.get(Message.getEmetteur().getId());

			if (mementos.size() - 2 >= currentMessageIndex) {
				System.out.println("Message Suivant");
				mementos.get(++currentMessageIndex).restore(Message);
			}
		}
	}

}
