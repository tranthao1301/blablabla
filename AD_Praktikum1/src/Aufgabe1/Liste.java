package Aufgabe1;

public interface Liste<E> {

	/**
	 *  Gibt die Anzahl der Elemente in der Liste wieder
	 * @return 
	 * 			Die Anzahl der Elemente in der Liste
	 * @throws IllegalArgumentException
	 */
	public int size();
	
	/**
	 *  Fuegt ein Element an einer beliebigen Position ein
	 * @param elem
	 * 				Das Element welches eingefuegt werden soll
	 * @param pos
	 * 				Die Position an der das Element eingefuegt werden soll
	 * @throws IllegalArgumentException
	 */
	public void add(E elem, int pos) throws IllegalArgumentException;
	
	/**
	 * Loescht ein Element aus der Liste
	 * @param pos
	 * 				Die Position an welcher das Element geloescht werden soll
	 * 
	 * @throws IllegalArgumentException
	 */
	public void delete(int pos) throws IllegalArgumentException;
	
	/**
	 * Gibt ein Element von einer beliebigen Position wieder
	 * @param pos
	 * 				Die Position von welcher das Element wiedergegeben werden soll
	 * 
	 * @return
	 * 				Das gesuchte Element
	 * 
	 * @throws IllegalArgumentException
	 */
	public E get(int pos) throws IllegalArgumentException;
	
	/**
	 * Leert die Liste
	 * @throws IllegalArgumentException
	 */
	public void empty();
}
