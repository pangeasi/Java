package examenEj5;

import java.util.Arrays;

public class Ej5 {

	public static void main(String[] args) {
		String texto = "murcielago pajaro sol abuelito comunicante";
		String letras = "aeiou";
		char[] letrasArr = letras.toCharArray();
		int count = 0;
		
		List palabras = new List();
		
		String[] strArr = texto.split(" ");
		for(String i:strArr) {
			if(i.length() >=5) {
				char[] c = i.toCharArray();
				for(int k=0;k<c.length;k++) {
					if(!letras.contains(""+c[k])) {
						c[k] = 'z';
					}
				}
				Arrays.sort(c);
				for(int j=0;j<5;j++) {
					if(c[j] == letrasArr[j]) {
						count++;
					}
					if(c[j] == letrasArr[j] && count == 5) {
						palabras.addEnd(i);
					}
				}
			}
			count = 0;
		}
		
		palabras.print();
		
	}

}
