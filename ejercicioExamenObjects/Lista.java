package ejercicioExamenObjects;

import java.util.Comparator;

public class Lista {
	private Nodo com;
	
	public Lista(Nodo x) {
		com = x;
		
	}
	public Lista() {
		com = null;
	}
	
	
	
	public void add(Alumno x) {
		Nodo pepetter = new Nodo();
		pepetter.setInfo(x);
		pepetter.setNext(com);
		com=pepetter;
			
	}
	
	public void addEnd(Alumno x) {
		Nodo pepetter = com;
		if(com==null) {
			com=new Nodo(x);
		}else { 
			while(pepetter.getNext()!=null) {
			pepetter=pepetter.getNext();
			}
			pepetter.setNext(new Nodo(x));
		} 		
		
	}
	public void print() {
		Nodo nuevo = com;
		while(nuevo!= null) {
			System.out.println(nuevo.toString() + " " + Math.round(nuevo.getInfo().media()));
			nuevo=nuevo.getNext();
		}
	}
	public void sortList(Comparator<Alumno> c) {
		Nodo p = com;
		
		while(p != null){
			Nodo q = p.getNext();
			while(q != null){
				if(c.compare(p.getInfo(), q.getInfo()) == 1){
					Alumno aux = p.getInfo();
					p.setInfo(q.getInfo());
					q.setInfo(aux);
				}
				q = q.getNext();
			}
			p = p.getNext();
		}
		
	}
	
	
}
