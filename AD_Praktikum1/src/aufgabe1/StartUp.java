package aufgabe1;

/**
 * Gibt die Ergebnisse des Performance Vergleiches zwischen ArrayList und LinkedList aus!
 * 
 * @author Thu Thao Tran 
 *		   Paulina Pansow
 */
public class StartUp {

	public static void main(String[] args) {
		PerformanceVergleich pv = new PerformanceVergleich();
		double sum1;
		double sum2;
		double result1;
		double result2;
		
		System.out.println("VERGLEICH 10000 MAL EINFUEGEN AM ANFANG:");
		sum1 = pv.addFirstArrayList();
		sum2 = pv.addFirstLinkedList();
		for(int i = 0; i <10; i++) {
		result1 = pv.addFirstArrayList();
		sum1 += result1;
		result2 = pv.addFirstLinkedList();
		sum2 += result2;
		}
		System.out.println("Das Einfuegen am Anfang einer ArrayList dauert durchschnittlich:" + (sum1/10) + " Millisekunden");
		System.out.println("Das Einfuegen am Anfang einer LinkedList dauert durchschnittlich:" + (sum2/10) + " Millisekunden");
		System.out.println();
		
		System.out.println("VERGLEICH 10000 MAL EINFUEGEN AM ENDE:");
		sum1 = pv.addLastArrayList();
		sum2 = pv.addLastLinkedList();
		for(int i = 0; i < 10; i++) {
		result1 = pv.addLastArrayList();
		sum1 += result1;
		result2 = pv.addLastLinkedList();
		sum2 += result2;
		}
		System.out.println("Das Einfuegen am Ende einer ArrayList dauert durchschnittlich:" + (sum1/10) + " Millisekunden");
		System.out.println("Das Einfuegen am Ende einer LinkedList dauert durchschnittlich:" + (sum2/10) + " Millisekunden");
		System.out.println();
		
		System.out.println("VERGLEICH 10000 MAL EINFUEGEN AN ZUFALLSPOSITIONEN:");
		sum1 = pv.addRandomArrayList();
		sum2 = pv.addRandomLinkedList();
		for(int i = 0; i < 10; i++) {
		result1 = pv.addRandomArrayList();
		sum1 += result1;
		result2 = pv.addRandomLinkedList();
		sum2 += result2;
		}
		System.out.println("Das Einfuegen an zufaelligen Positionen einer ArrayList dauert durchschnittlich:" + (sum1/10) + " Millisekunden");
		System.out.println("Das Einfuegen an zufaelligen Positionen einer LinkedList dauert durchschnittlich:" + (sum2/10) + " Millisekunden");
		System.out.println();
		
		System.out.println("VERGLEICH 1000 MAL LOESCHEN AM ANFANG:");
		sum1 = pv.deleteFirstArrayList();
		sum2 = pv.deleteFirstLinkedList();
		for(int i = 0; i < 10; i++) {
		result1 = pv.deleteFirstArrayList();
		sum1 += result1;
		result2 = pv.deleteFirstLinkedList();
		sum2 += result2;
		}
		System.out.println("Das Loeschen am Anfang einer ArrayList dauert durchschnittlich:" + (sum1/10) + " Millisekunden");
		System.out.println("Das Loeschen am Anfang einer LinkedList dauert durchschnittlich:" + (sum2/10) + " Millisekunden");
		System.out.println();
		
		System.out.println("VERGLEICH 1000 MAL LOESCHEN AM ENDE:");
		sum1 = pv.deleteLastArrayList();
		sum2 = pv.deleteLastLinkedList();
		for(int i = 0; i < 10; i++) {
		result1 = pv.deleteLastArrayList();
		sum1 += result1;
		result2 = pv.deleteLastLinkedList();
		sum2 += result2;
		}
		System.out.println("Das Loeschen am Ende einer ArrayList dauert durchschnittlich:" + (sum1/10) + " Millisekunden");
		System.out.println("Das Loeschen am Ende einer LinkedList dauert durchschnittlich:" + (sum2/10) + " Millisekunden");
		System.out.println();
		
		System.out.println("VERGLEICH 1000 MAL LOESCHEN AN ZUFALLSPOSITIONEN:");
		sum1 = pv.deleteRandomArrayList();
		sum2 = pv.deleteRandomLinkedList();
		for(int i = 0; i < 10; i++) {
		result1 = pv.deleteRandomArrayList();
		sum1 += result1;
		result2 = pv.deleteRandomLinkedList();
		sum2 += result2;
		}
		System.out.println("Das Loeschen an zufaelligen Positionen einer ArrayList dauert durchschnittlich:" + (sum1/10) + " Millisekunden");
		System.out.println("Das Loeschen an zufaelligen Positionen einer LinkedList dauert durchschnittlich:" + (sum2/10) + " Millisekunden");
		System.out.println();
	}

}
