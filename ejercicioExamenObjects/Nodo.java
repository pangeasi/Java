package ejercicioExamenObjects;

public class Nodo {
	private Alumno info;
	private Nodo next;
	
	public Nodo() {
		next = null;
		info = null;
	}
	
	public Nodo(Alumno x) {
		info = x;
		next=null;
	}
	
	public Alumno getInfo() {
		return info;
	}
	public void setInfo(Alumno info) {
		this.info = info;
	}
	public Nodo getNext() {
		return next;
	}
	public void setNext(Nodo next) {
		this.next = next;
	}
	
	public String toString() {
		String miPolla= this.info.toString() + " ]--->";
		return miPolla;
	}
	
	
}
