package aufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testet die Klasse ArrayList 
 * 
 * @author Thu Thao Tran
 * 		   Paulina Pansow
 * 		
 */
public class ArrayListTest {

	/**
	 * Testet die Initialisierung des Konstruktors
	 */
	@Test
	public void testKonstruktor() {
		ArrayList<Integer> al = new ArrayList<>();
		assertNotNull(al);
	}
	
	/**
	 * Testet ob die Methode die wirkliche Anzahl von Elementen in der Liste widergibt
	 */
	@Test
	public void testSize()
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 10; i++)
		{
			al.add(i, i);
		}
		assertEquals(10, al.size());
	}
	
	/**
	 * Testet ob das Hinzufuegen von Elementen funktioniert
	 */
	@Test
	public void testAdd()
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Laura", 0);
		assertEquals("Laura", al.get(0));
	}
	
	/**
	 * Testet ob das Loeschen von Elementen in der Liste funktioniert
	 */
	@Test
	public void testDelete()
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 10; i++)
		{
			al.add(i, i);
		}
		assertEquals(10, al.size());
		
		for(int i = 0; i < 5; i++)
		{
			al.delete(i);
		}
		assertEquals(5, al.size());
	}

	/**
	 * Testet ob die Methode das gewuenschte Element zurueckgibt 
	 */
	@Test
	public void testGet()
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Laura", 0);
		assertEquals("Laura", al.get(0));
	}
	
	/**
	 * Testet ob die Methode komplett geleert wird
	 */
	@Test
	public void testEmpty()
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 10; i++)
		{
			al.add(i, i);
		}
		
		assertEquals(10, al.size());
		al.empty();
		assertEquals(0, al.size());
	}
}
