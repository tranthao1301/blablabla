package Aufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void testKonstruktor() {
		ArrayList<Integer> al = new ArrayList<>();
		assertNotNull(al);
	}
	
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
	
	@Test
	public void testAdd()
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Laura", 0);
		assertEquals("Laura", al.get(0));
	}
	
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

	@Test
	public void testGet()
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Laura", 0);
		assertEquals("Laura", al.get(0));
	}
	
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
