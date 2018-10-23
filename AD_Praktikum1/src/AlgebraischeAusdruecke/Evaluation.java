package AlgebraischeAusdruecke;


public class Evaluation {

	/**
	   * Wertet einen gegebenen Ausdruck aus.
	   *
	   * Annahmen
	   * Es sind folgende Terme erlaubt:
	   * positive ganze Zahlen
	   * Klammern ()
	   * Grundoperationen +−∗/
	   * Ausdrücke müssen vollständig geklammert sein
	   * Operationen haben genau zwei Operanden
	   * Operanden sind Zahlen oder Klammer-Ausdrücke
	   * keine Punkt- vor Strichrechnung
	   * @param expr Der Ausdruck
	   * @throws IllegalArgumentException bei ungueltigem Ausdruck
	   * @return Das Ergebnis als Ganzzahl
	   */
	public int eval(String exp)
	{
		String[] split = exp.split(" ");
		Stack<String> stack = new Stack<>();
		for(String token : split) {
			if(!token.equals(")")) {
				stack.push(token);
			}
			else {
				String operand2 = stack.pop();
				String operator = stack.pop();
				String operand1 = stack.pop();
				String dummy = stack.pop();
				String ergebnis = String.valueOf(evalSingle(operator, operand1, operand2));
				stack.push(ergebnis);
			}
		}
		return Integer.parseInt(stack.pop());
	}
	
	  /**
	   * Evaluiert eine einzelne Rechnung, z.B.: 5 * 3, dabei ist der Operator das erste Argument und die Operanden das zweite und dritte.
	   * @param operator Der Operator, gueltige Operatoren sind + - * /
	   * @param operand1 Erster ganzzahliger Operand
	   * @param operand2 Zweiter ganzzahliger Operand
	   * @return Den ausgewerteten Ausdruck
	   */
	public static int evalSingle(String operator, String operand1, String operand2)
	{
		int zahl1;
		int zahl2;
		
		try {
			zahl1 = Integer.parseInt(operand1);
			zahl2 = Integer.parseInt(operand2);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(
					"Diese sind keine gültigen Zahlen", e);
		}
		
		switch(operator) {
		case "+": return zahl1 + zahl2;
		case "-": return zahl1 - zahl2;
		case "*": return zahl1 * zahl2;
		case "/": return zahl1 / zahl2;
		default: throw new IllegalArgumentException("Unbekannter Operator: " + operator);
		}
	}
	
	public static boolean isValid(String[] split) {
	if(!split[0].equals("(") || !split[split.length-1].equals(")")) {
		return false;
	}
	
	Stack<String> klammer = new Stack<>();
	for(String s : split) {
		if(s.equals("(")) {
			klammer.push(".");
		}
		else if(s.equals(")")) {
			try {
				klammer.pop();
			} catch (IllegalArgumentException e) {
				return false;
			}
		}
	}
	
	if(!klammer.isEmpty()) {
		return false;
	}
	
	for(String s : split) {
	if(!s.equals("+") || !s.equals("-") || !s.equals("*") || !s.equals("/"))
	{
		return false;
	}
	}
	return true;
	}
}
