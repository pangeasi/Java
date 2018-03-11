package ejercicioExamenObjects;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();
				
		l.addEnd(new Alumno("Edu",new int[] {2,5,7}));	
		l.addEnd(new Alumno("Jaime",new int[] {2,7,9}));	
		l.addEnd(new Alumno("Max",new int[] {2,8,7}));	
		l.addEnd(new Alumno("David",new int[] {2,5,7}));	
		l.addEnd(new Alumno("Dani",new int[] {2,5,7}));	
		l.add(new Alumno("Andres", new int[] {10,10,10}));
		
		l.sortList(new MediaComparator());
		
		l.print();
	}

}
