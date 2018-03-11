package ejercicioExamenObjects;

import java.util.Comparator;

public class MediaComparator implements Comparator<Alumno> {
	public int compare(Alumno al1, Alumno al2) {
		double alumno1 = al1.media();
		double alumno2 = al2.media();
		
		if(alumno1 < alumno2) {
			return 1;
		}
		if(alumno1 > alumno2) {
			return -1;
		}
		return 0;
		
	}
}
