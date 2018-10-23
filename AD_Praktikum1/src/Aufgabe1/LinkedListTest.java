package Aufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testKonstruktor() {
		LinkedList<Integer> myList = new LinkedList<>();
		assertNotNull(myList);
	}
	
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
	
	@Test
	public void testAdd()
	{
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Laura", 0);
		assertEquals("Laura", myList.get(0));
	}
	
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

	@Test
	public void testGet()
	{
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Laura", 0);
		assertEquals("Laura", myList.get(0));
	}
	
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
