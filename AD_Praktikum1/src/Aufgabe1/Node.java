package Aufgabe1;

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
 */
public Node(E element, Node<E> vorgaenger, Node<E> nachfolger) {
	_element = element;
	_vorgaenger = vorgaenger;
	_nachfolger = nachfolger;
}

/**
 * 
 * @return
 */
public Node<E> gibNachfolger() {
	return _nachfolger;
}

/**
 * 
 * @param nachfolger
 */
public void setzeNachfolger(Node<E> nachfolger) {
	_nachfolger = nachfolger;
}

/**
 * 
 * @return
 */
public Node<E> gibVorgaenger() {
	return _vorgaenger;
}

public void setzeVorgaenger(Node<E> vorgaenger) {
	_vorgaenger = vorgaenger;
}

public E gibElement() {
	return _element;
}

public void setzeElement(E element) {
	_element = element;
}

}
