package AlgebraischeAusdruecke;

/**
 * Gibt die Ergebnisse der Auswertung der algebraischen Ausdruecke zurueck
 * 
 * @author Thu Thao Tran
 *		   Paulina Pansow
 */
public class StartUp {

	public static void main(String[] args) {
		Evaluation test = new Evaluation();
		System.out.println(test.eval("( ( 6 * ( 4 + 2 ) ) + ( 5 - 1 ) )"));
		System.out.println(test.eval("( ( 5 * 2 ) + 4 )"));
		System.out.println(test.eval("( ( ( 1 + 2 ) * 3 ) - ( 7 * 8 ) )"));
		System.out.println(test.eval("( ( 6 * ( 4 * 28 ) ) + ( 9 - ( ( 12 / 4 ) * 2 ) ) )"));
	}

}
