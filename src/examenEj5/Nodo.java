package examenEj5;

public class Nodo {
	private String info;
	private Nodo sig;
	
	public Nodo() {
		
	}
	
	public Nodo(String x) {
		this.info = x;
		this.sig = null;
	}
	
	public void setSig(Nodo x) {
		this.sig = x;
	}
	
	public Nodo getSig() {
		return this.sig;
	}
	public String getInfo() {
		return this.info;
	}
	
}
