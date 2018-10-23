package AlgebraischeAusdruecke;

public class Evaluation {

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
}
