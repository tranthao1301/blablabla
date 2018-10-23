package Aufgabe1;


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
	
	@Override
	public int size()
	{
		return _size;
	}
	
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
	
	@Override
	public void empty()
	{
		_listenkopf.setzeNachfolger(_listenende);
		_listenende.setzeVorgaenger(_listenkopf);
		_size = 0;
	}
}
