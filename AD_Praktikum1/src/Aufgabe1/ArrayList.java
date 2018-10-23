package Aufgabe1;

import java.util.Arrays;

public class ArrayList<E> implements Liste<E> {

	private final int _anfangskapazitaet;
	private int _size;
	private E[] _array;
	
	@SuppressWarnings("unchecked")
	public ArrayList()
	{
		_anfangskapazitaet = 10;
		_array = (E[]) new Object[_anfangskapazitaet];
		_size = 0;
	}
	
	@Override
	public int size()
	{
		return _size;
	}
	
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
	
	@Override
	public void delete(int pos) throws IllegalArgumentException
	{

		if(pos < 0 && pos > _array.length)
		{
			throw new IllegalArgumentException("Ungültige Position");
		}
		_array[pos] = null;
		for(int i = pos; i < _size; i++) {
			_array[i] = _array[i+1];
		}
		_size--;
	}
	
	@Override
	public E get(int pos) throws IllegalArgumentException
	{
		if(pos < 0 && pos > _array.length)
		{
			throw new IllegalArgumentException("Ungültige Position");
		}
		
		E result = _array[pos];
		return result;
	}
	
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
