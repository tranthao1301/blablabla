package Aufgabe1;

public interface Liste<E> {

	public int size();
	public void add(E elem, int pos) throws IllegalArgumentException;
	public void delete(int pos) throws IllegalArgumentException;
	public E get(int pos) throws IllegalArgumentException;
	public void empty();
}
