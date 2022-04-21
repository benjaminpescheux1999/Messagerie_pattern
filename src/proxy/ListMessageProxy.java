package proxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import model.Message;

public class ListMessageProxy implements List<Message> {
	private List<Message> internalList;

	private void load() {
		if (this.internalList == null) {
			System.out.println("CHARGEMENT ...");
			this.internalList = new ArrayList<>();

			this.internalList.add(new Message());
			this.internalList.add(new Message());
			this.internalList.add(new Message());
		}
	}

	public int size() {
		this.load();
		return this.internalList.size();
	}

	public boolean isEmpty() {
		this.load();
		return this.internalList.isEmpty();
	}

	public boolean contains(Object o) {
		this.load();
		return this.internalList.contains(o);
	}

	public Iterator<Message> iterator() {
		this.load();
		return this.internalList.iterator();
	}

	public Object[] toArray() {
		this.load();
		return this.internalList.toArray();
	}

	public <T> T[] toArray(T[] a) {
		this.load();
		return this.internalList.toArray(a);
	}

	public boolean add(Message e) {
		this.load();
		return this.internalList.add(e);
	}

	public boolean remove(Object o) {
		this.load();
		return this.internalList.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		this.load();
		return this.internalList.containsAll(c);
	}

	public boolean addAll(Collection<? extends Message> c) {
		this.load();
		return this.internalList.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends Message> c) {
		this.load();
		return this.internalList.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		this.load();
		return this.internalList.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		this.load();
		return this.internalList.retainAll(c);
	}

	public void clear() {
		if (this.internalList != null) {
			this.internalList.clear();
		}
	}

	public Message get(int index) {
		this.load();
		return this.internalList.get(index);
	}

	public Message set(int index, Message element) {
		this.load();
		return this.internalList.set(index, element);
	}

	public void add(int index, Message element) {
		this.load();
		this.internalList.add(index, element);
	}

	public Message remove(int index) {
		this.load();
		return this.internalList.remove(index);
	}

	public int indexOf(Object o) {
		this.load();
		return this.internalList.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		this.load();
		return this.internalList.lastIndexOf(o);
	}

	public ListIterator<Message> listIterator() {
		this.load();
		return this.internalList.listIterator();
	}

	public ListIterator<Message> listIterator(int index) {
		this.load();
		return this.internalList.listIterator(index);
	}

	public List<Message> subList(int fromIndex, int toIndex) {
		this.load();
		return this.internalList.subList(fromIndex, toIndex);
	}
}
