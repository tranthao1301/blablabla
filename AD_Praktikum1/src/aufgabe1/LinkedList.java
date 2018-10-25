package aufgabe1;

/**
 * Implementiert das Interface Liste auf dem Prinzip von
 * doppelt-verketteten Knoten
 * 
 * @author Thu Thao Tran
 * 		   Paulina Pansow
 * 
 * @version 23.10.2018
 *
 * @param <E>
 */
public class LinkedList<E> implements Liste<E> {

	private Node<E> _listenkopf;
	private Node<E> _listenende;
	private int _size;
	
	public LinkedList()
	{
		_listenkopf = new Node<E>();
		_listenende = new Node<E>();
		_listenkopf.setzeNachfolger(_listenende);
		_listenende.setzeVorgaenger(_listenkopf);
	}
	
	/**
	 * Gib die Laenge der Liste zurueck.
	 * 
	 * @return Anzahl der Elemente in der Liste.
	 */
	@Override
	public int size()
	{
		return _size;
	}
	
	/**
	 * Fuegt ein Element in die Liste an einer bestimmten Position ein
	 * 
	 * @param elem
	 *            Das Element welches eingefuegt wird
	 * 
	 * @param pos
	 *            Die Position an welcher das Element eingefuegt wird
	 */
	@Override
	public void add(E element, int pos) throws IllegalArgumentException
	{
		if (element == null)
		{
			throw new IllegalArgumentException(
					"Das Element darf nicht null sein.");
		}
		if(pos < 0 && pos > _size)
		{
			throw new IllegalArgumentException("Ungueltige Position");
		}
		Node<E> currentNode = _listenkopf;
		Node<E> addedNode = new Node<E>();
		addedNode.setzeElement(element);
		for(int i = 0; i < pos; i++) 
		{
			currentNode = currentNode.gibNachfolger();
		}
			addedNode.setzeVorgaenger(currentNode);
			addedNode.setzeNachfolger(currentNode.gibNachfolger());;
			currentNode.setzeNachfolger(addedNode);
			currentNode.gibNachfolger().setzeVorgaenger(addedNode);
			_size++;
	}
	
	/**
	 *  Loescht ein Element an einer Position Stelle 
	 *  
	 *  @param pos 	
	 *  			Die Position an welcher das Elemnent geloescht werden soll
	 */
	@Override
	public void delete(int pos) throws IllegalArgumentException
	{
		Node<E> currentNode = _listenkopf;
		for(int i = 0; i <= pos; i++)
		{
			currentNode = currentNode.gibNachfolger();
		}
		currentNode.gibVorgaenger().setzeNachfolger(currentNode.gibNachfolger());
		currentNode.gibNachfolger().setzeVorgaenger(currentNode.gibVorgaenger());
		_size--;
	}
	
	/**
	 * Gibt ein Element von einer beliebigen Position wieder
	 * 
	 * @param pos 
	 * 				Die Position von welcher das Element zurueckgegeben werden soll
	 * 
	 * @return gesuchtesElement
	 *							Das gesuchte Element 								
	 */
	@Override
	public E get(int pos) throws IllegalArgumentException
	{
		if (pos < 0 && pos > _size)
		{
			throw new IllegalArgumentException("Ungueltige Position");
		}
		
		Node<E> currentNode = _listenkopf;
		for(int i = 0; i < pos; i++)
		{
			currentNode = currentNode.gibNachfolger();
		}
		
		return currentNode.gibElement();
	}
	
	/**
	 *  Leert die Liste
	 *  
	 */
	@Override
	public void empty()
	{
		_listenkopf.setzeNachfolger(_listenende);
		_listenende.setzeVorgaenger(_listenkopf);
		_size = 0;
	}
}
