package ejercicioExamenObjects;

import java.util.Arrays;

public class Prueba {
	public static String[] capme(String[] nombres) {
		String nombre = "";
		
		for(String palabra:nombres){
			char[] c = palabra.toCharArray();
			c[0] = Character.toUpperCase(c[0]);
			for(char i:c) {
				nombre+=i;
			}
			palabra = nombre;
		}
		return nombres;
		
	}
	public static void main(String[] args) {
		String[] nombres = new String[] {"paco","pepe","polla"};
		
		/*for(String nom:capme(nombres)) {
			System.out.println(nom);
		}*/
	}

}
