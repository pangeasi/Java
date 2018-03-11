package listasEnlazadas;

public class TestLists {
	
	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		
		l.addEnd(new Punto(4,2));
		l.addEnd(new Punto(4,6));
		l.addStart(new Punto(1,6));
		l.addEnd(new Punto(2,9));
		for(int i=0;i<10;i++) {
			l.addEnd(new Punto((int)(Math.random()*10),(int)(Math.random()*10)));
		}
		l.print();
	}

}
