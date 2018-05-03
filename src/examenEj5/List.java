package examenEj5;

public class List {
	private Nodo com;
	
	public List() {
		
	}
	
	public void addEnd(String x) {
		Nodo newNodo = new Nodo(x);
		if(this.com == null) {
			this.com = newNodo;
		}else {
			Nodo p = new Nodo();
			p = this.com;
			while(p.getSig() != null) {
				p = p.getSig();
			}
			p.setSig(newNodo);
		}
	}
	
	public void print() {
		Nodo p = new Nodo();
		p = this.com;
		while(p != null) {
			System.out.println(p.getInfo());
			p = p.getSig();
		}
	}
}
