package aufgabe1;

import java.util.Arrays;

/**
 * Implementiert das Interface Liste mit einem Array-basierten Liste 
 *  
 * @author 
 *
 * Thu Thao Tran
 * Paulina Pansow
 *
 * 23.10.2018
 */

public class ArrayList<E> implements Liste<E> {

	private final int _anfangskapazitaet;
	private int _size;
	private E[] _array;
	
	/**
	 * Initialisiert eine Array-List
	 * @param type 
	 * 				Der Typ des Arrays
	 */

	@SuppressWarnings("unchecked")
	public ArrayList()
	{
		_anfangskapazitaet = 10;
		_array = (E[]) new Object[_anfangskapazitaet];
		_size = 0;
	}
	
	/**
	 *  Gibt die Anzahl der Elemente in der Liste wieder
	 *  
	 *  @return _size Die Groesse des Arrays
	 */
	@Override
	public int size()
	{
		return _size;
	}
	
	/**
	 *  Fuegt ein Element an einer beliebigen Position ein
	 *  
	 *  @param element 
	 *  				Das Element welches gesetzt wird
	 *  @param pos 
	 *  				Die Position an welcher das Element gesetzt wird
	 */
	@Override
	public void add(E element, int pos) throws IllegalArgumentException
	{
		if(element == null)
		{
			throw new IllegalArgumentException("Das Element darf nicht null sein");
		}
		if(pos < 0 && pos > _array.length)
		{
			throw new IllegalArgumentException("Ungueltige Position");
		}
		if(_size == _array.length)
		{
			_array = Arrays.copyOf(_array, _array.length*2);
		}
		for(int i = _size; i > pos; i--)
		{
			_array[i] = _array[i-1];
		}
		_array[pos] = element;
		_size++;
	}
	
	/**
	 *  Loescht ein Element an einer Position Stelle 
	 *  
	 *  @param pos 	
	 *  			Die Position an welcher das Elemnent gelöscht werden soll
	 */
	@Override
	public void delete(int pos) throws IllegalArgumentException
	{

		if(pos < 0 && pos > _array.length)
		{
			throw new IllegalArgumentException("Ung�ltige Position");
		}
		_array[pos] = null;
		for(int i = pos; i < _size; i++) {
			_array[i] = _array[i+1];
		}
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
		if(pos < 0 && pos > _array.length)
		{
			throw new IllegalArgumentException("Ung�ltige Position");
		}
		
		E result = _array[pos];
		return result;
	}
	
	/**
	 *  Leert die Liste
	 *  
	 */
	@Override
	public void empty()
	{
		for(int i = 0; i < _array.length; i++)
		{
			_array[i] = null;
			_size = 0;
		}
	}
}
