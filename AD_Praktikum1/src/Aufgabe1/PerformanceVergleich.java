package Aufgabe1;

import java.util.Random;

public class PerformanceVergleich {

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
