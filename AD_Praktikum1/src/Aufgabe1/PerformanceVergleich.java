package Aufgabe1;

import java.util.Random;

/**
 * Vergleicht die Perfomance der LinkedList und der ArrayList jeweils beim loeschen und einfuegen von Elementen
 * 
 * @author Thu Thao Tran
 * 		   Paulina Pansow	
 *
 */
public class PerformanceVergleich {

	/**
	 * Bestimmt die Dauer der Ausfuehrungzeit um 10.000 zufaellige Elemente am Anfang einer ArrayList einzufuegen
	 */
	public void addFirstArrayList()
	{
		double start = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			al.add(random, 0);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Einfuegen am Anfang einer ArrayList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Aufuehrungszeit um 10.000 Elemente am Ende einer ArrayList einzufuegen
	 */
	public void addLastArrayList()
	{
		double start = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			al.add(random, al.size());
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Einfuegen am Ende einer ArrayList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Aufuehrungszeit um 10.000 Elemente an zufaelligen Positionen einer ArrayList einzufuegen
	 */
	public void addRandomArrayList()
	{
		double start = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			int position = new Random().nextInt(al.size()+1);
			al.add(random, position);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Einfuegen an zufaelligen Position einer ArrayList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Aufuehrungszeit um 1000 Elemente am Anfang einer ArrayList zu loeschen
	 */
	public void deleteFirstArrayList()
	{
		double start = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			al.add(random, 0);
		}
		
		for(int i = 0; i < 1000; i++)
		{
			al.delete(0);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Loeschen am Anfang einer ArrayList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Aufuehrungszeit um 1000 Elemente am Ende einer ArrayList zu loeschen
	 */
	public void deleteLastArrayList()
	{
		double start = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			al.add(random, 0);
		}
		for(int i = 0; i < 1000; i++)
		{
			al.delete(al.size()-1);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Loeschen am Ende einer ArrayList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Aufuehrungszeit um 1000 Elemente an zufaelligen Positionen einer ArrayList zu loeschen
	 */
	public void deleteRandomArrayList()
	{
		double start = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			al.add(random, 0);
		}
		
		for(int i = 0; i < 1000; i++)
		{
			int position = new Random().nextInt(al.size()+1);
			al.delete(position);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Loeschen an zufaelligen Position einer ArrayList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Ausfuehrungzeit um 10.000 zufaellige Elemente am Anfang einer LinkedList einzufuegen
	 */
	public void addFirstLinkedList()
	{
		double start = System.currentTimeMillis();
		
		LinkedList<Integer> myList = new LinkedList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			myList.add(random, 0);
		}
		
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Einfuegen am Anfang einer LinkedList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Ausfuehrungzeit um 10.000 zufaellige Elemente am Ende einer LinkedList einzufuegen
	 */
	public void addLastLinkedList()
	{
		double start = System.currentTimeMillis();
		
		LinkedList<Integer> myList = new LinkedList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			myList.add(random, myList.size());
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Einfuegen am Ende einer LinkedList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Ausfuehrungzeit um 10.000 zufaellige Elemente an zufaelligen Positionen einer LinkedList einzufuegen
	 */
	public void addRandomLinkedList()
	{
		double start = System.currentTimeMillis();
		
		LinkedList<Integer> myList = new LinkedList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			int pos = new Random().nextInt(myList.size()+1);
			myList.add(random, pos);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Einfuegen an zufaelligen Position einer LinkedList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Ausfuehrungzeit um 1000 zufaellige Elemente am Anfang einer LinkedList zu loeschen
	 */
	public void deleteFirstLinkedList()
	{
		double start = System.currentTimeMillis();
		
		LinkedList<Integer> myList = new LinkedList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			myList.add(random, 0);
		}
		
		for(int i = 0; i < 1000; i++)
		{
			myList.delete(0);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Loeschen am Anfang einer LinkedList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Ausfuehrungzeit um 1000 zufaellige Elemente am Ende einer LinkedList zu loeschen
	 */
	public void deleteLastLinkedList()
	{
		double start = System.currentTimeMillis();
		
		LinkedList<Integer> myList = new LinkedList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			myList.add(random, 0);
		}
		
		for(int i = 0; i < 1000; i++)
		{
			myList.delete(myList.size()-1);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Loeschen am Anfang einer LinkedList dauert:" + result + " Millisekunden");
	}
	
	/**
	 * Bestimmt die Dauer der Ausfuehrungzeit um 1000 zufaellige Elemente an zufaelligen Positionen einer LinkedList zu loeschen
	 */
	public void deleteRandomLinkedList()
	{
		double start = System.currentTimeMillis();
		
		LinkedList<Integer> myList = new LinkedList<>();
		
		for(int i = 0; i < 10000; i++)
		{
			int random = (int) Math.random();
			myList.add(random, 0);
		}
		
		for(int i = 0; i < 1000; i++)
		{
			int pos = new Random().nextInt(myList.size());
			myList.delete(pos);
		}
		double end = System.currentTimeMillis();
		double result = end - start;
		System.out.println("Das Loeschen an zufälligen Positionen einer LinkedList dauert:" + result + " Millisekunden");
	}
}
