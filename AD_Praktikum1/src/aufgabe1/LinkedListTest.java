package aufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testet die Klasse LinkedList 
 * 
 * @author Thu Thao Tran
 * 		   Paulina Pansow
 * 		
 */
public class LinkedListTest {

	/**
	 * Testet die Initialisierung des Konstruktors
	 */
	@Test
	public void testKonstruktor() {
		LinkedList<Integer> myList = new LinkedList<>();
		assertNotNull(myList);
	}
	
	/**
	 * Testet ob die Methode die wirkliche Anzahl von Elementen in der Liste widergibt
	 */
	@Test
	public void testSize()
	{
		LinkedList<Integer> myList = new LinkedList<>();
		for(int i = 0; i < 10; i++)
		{
			myList.add(i, i);
		}
		assertEquals(10, myList.size());
	}
	
	/**
	 * Testet ob das Hinzufuegen von Elementen funktioniert
	 */
	@Test
	public void testAdd()
	{
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Laura", 0);
		assertEquals("Laura", myList.get(0));
	}
	
	/**
	 * Testet ob das Loeschen von Elementen in der Liste funktioniert
	 */
	@Test
	public void testDelete()
	{
		LinkedList<Integer> myList = new LinkedList<>();
		for(int i = 0; i < 10; i++)
		{
			myList.add(i, i);
		}
		assertEquals(10, myList.size());
		
		for(int i = 0; i < 5; i++)
		{
			myList.delete(i);
		}
		assertEquals(5, myList.size());
	}

	/**
	 * Testet ob die Methode das gewuenschte Element zurueckgibt 
	 */
	@Test
	public void testGet()
	{
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Laura", 0);
		assertEquals("Laura", myList.get(0));
	}
	
	/**
	 * Testet ob die Methode komplett geleert wird
	 */
	@Test
	public void testEmpty()
	{
		LinkedList<Integer> myList = new LinkedList<>();
		for(int i = 0; i < 10; i++)
		{
			myList.add(i, i);
		}
		
		assertEquals(10, myList.size());
		myList.empty();
		assertEquals(0, myList.size());
	}

}
