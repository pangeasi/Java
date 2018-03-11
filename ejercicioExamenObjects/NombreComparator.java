package ejercicioExamenObjects;

import java.util.Comparator;

public class NombreComparator implements Comparator<Alumno> {
	public int compare(Alumno al1, Alumno al2) {
		String nombre1 = al1.getNombre();
		String nombre2 = al2.getNombre();
		
		if(nombre1.length() > nombre2.length()) {
			return 1;
		}
		if(nombre1.length() < nombre2.length()){
			return 0;
		}
		return -1;
	}
}
