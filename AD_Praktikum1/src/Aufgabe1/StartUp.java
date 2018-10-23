package Aufgabe1;

public class StartUp {

	public static void main(String[] args) {
		PerformanceVergleich pv = new PerformanceVergleich();
		
		System.out.println("Vergleich 10000 mal Einfuegen am Anfang:");
		pv.addFirstArrayList();
		pv.addFirstLinkedList();
		System.out.println();
		
		System.out.println("Vergleich 10000 mal Einfuegen am Ende");
		pv.addLastArrayList();
		pv.addLastLinkedList();
		System.out.println();
		
		System.out.println("Vergleich 10000 mal Einfuegen an Zufallspositionen");
		pv.addRandomArrayList();
		pv.addRandomLinkedList();
		System.out.println();
		
		System.out.println("Vergleich Loeschen 1000 mal am Anfang");
		pv.deleteFirstArrayList();
		pv.deleteFirstLinkedList();
		System.out.println();
		
		System.out.println("Vergleich Loeschen 1000 mal am Ende");
		pv.deleteLastArrayList();
		pv.deleteLastLinkedList();
		System.out.println();
		
		System.out.println("Vergleich Loeschen 1000 mal an Zufallspositionen");
		pv.deleteRandomArrayList();
		pv.deleteRandomLinkedList();
		System.out.println();
	}

}
