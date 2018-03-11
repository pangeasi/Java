package ejercicioExamenObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Alumno {
	private String nombre ="";
	private int[] notas;
	
	
	public Alumno(String nombre, int[] x) {
		this.nombre = nombre;
		this.notas = x;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public double media() {
		double result = 0;
		for(int nota:notas) {
			result+=nota;
		}
		result = result/notas.length;
		
		return result;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	public int compareBy(Alumno other, Comparator<Alumno> c) {
		return c.compare(this, other);
		
	}
	
}
