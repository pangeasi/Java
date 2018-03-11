package listasEnlazadas;

public class Lista {
	private Nodo com;
	
	public Lista() {
		this.com = null;
	}
	public Lista(Nodo x) {
		com = x;
	}
	
	public Nodo getCom() {
		return com;
	}
	
	public void setCom(Nodo x) {
		com = x;
	}

	public void addStart(Punto p) {
		Nodo nuevo = new Nodo(p);
	
		if(this.com == null) {
			this.com = nuevo;
		}else {
			nuevo.setNext(com);
			this.com = nuevo;
			
		
		}
	}
	
	
	public void addEnd(Punto p) {
		Nodo nuevo = this.com;
		if(nuevo == null) {
			this.com = new Nodo(p);
		}else {
			while(nuevo.getNext() != null) {
				nuevo = nuevo.getNext();
			}
			nuevo.setNext(new Nodo(p));
		}
	}
	
	public void print() {
		if(this.com == null) {
			System.out.println("vacia");
		}else {
			Nodo n = this.com;
			while(n != null) {
				System.out.println(n.getInfo().toString());
				n=n.getNext();
			}
		}
		
	}
	
}
