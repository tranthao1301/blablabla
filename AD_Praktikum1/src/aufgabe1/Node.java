package aufgabe1;

/**
 * Die Klasse modelliert doppelt verkettbare Knoten.
 * 
 * @author Thu Thao Tran
 *         Paulina Pansow
 *         
 * @version 23.10.2018
 */
public class Node<E> {
	private Node<E> _vorgaenger;
	private Node<E> _nachfolger;
	private E _element;
public Node() {
	
}

/**
 * Erzeuge einen neuen Node und setze gleich Vorgaenger, Nachfolger und Element
 * @param element
 * @param vorgaenger
 * @param nachfolger
 * 
 */
public Node(E element, Node<E> vorgaenger, Node<E> nachfolger) {
	_element = element;
	_vorgaenger = vorgaenger;
	_nachfolger = nachfolger;
}

/**
 * Gibt den Nachfolger des Knotens zurueck
 * 
 */
public Node<E> gibNachfolger() {
	return _nachfolger;
}

/**
 * Setzt den Nachfolger des Knotens
 * 
 * @param nachfolger
 * 						Der nachfolgende Knoten
 */
public void setzeNachfolger(Node<E> nachfolger) {
	_nachfolger = nachfolger;
}

/**
 * Gibt den Vorgaenger des Knotens zurueck
 * 
 */
public Node<E> gibVorgaenger() {
	return _vorgaenger;
}

/**
 * Setzt den Vorgaenger des Knotens
 * 
 * @param nachfolger
 * 						Der nachfolgende Knoten
 */
public void setzeVorgaenger(Node<E> vorgaenger) {
	_vorgaenger = vorgaenger;
}

/**
 * Gibt das Element des Knotens zurueck
 * 
 * @return _element
 * 					Das zurueckgegebene Element des Knotens
 */
public E gibElement() {
	return _element;
}

/**
 * Setzt das Element des Knotens 
 * 
 * @param element
 * 					Das Element des Knotens
 */
public void setzeElement(E element) {
	_element = element;
}

}
