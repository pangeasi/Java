package listasEnlazadas;

public class Nodo {
	private Punto p;
	private Nodo next;
	public Nodo() {
		next = null;
	}
	public Nodo(Punto p) {
		this.p = p;
		next = null;
	}
	public Nodo(Punto p, Nodo y) {
		this.p = p;
		next = y;
	}
	
	public Punto getInfo() {
		return p;
	}
	
	public Nodo getNext() {
		return next;
	}
	
	public void setInfo(Punto x) {
		this.p = x;
	}
	
	public void setNext(Nodo x) {
		next = x;
	}
	
	
}
