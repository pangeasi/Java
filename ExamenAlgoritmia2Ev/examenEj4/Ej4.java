package examenEj4;

import java.util.Arrays;

public class Ej4 {
	
	public static int palabraDyc(String x) {
		char[] c = x.toCharArray();
		int seqY = 0;
		int seqX = 0;
		int seqXMayor = 0;
		int counter = 0;
		
		for(int i=0;i<c.length-1;i++) {
			if(c[i] == 'Y' && c[i] == c[i+1]) {
				seqY++;
			}
			if(c[i] == 'Y' && !(c[i] == c[i+1])) {
				seqY++;
				break;
			}
		}
		for(int i=0;i<c.length-1;i++) {
			if(c[i] == 'X' && c[i] == c[i+1]) {
				seqX++;
			}
			if(c[i] == 'X' && !(c[i] == c[i+1])) {
				seqX++;
				seqXMayor = seqX;
				seqX = 0;
			}
		}
		
		if(seqY > seqXMayor) {
			return -1;
		}
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			if(c[i] == c[i+1]) {
				counter++;
			}else {
				counter++;
				break;
			}
		}
		if(!(1 == (c.length/(counter*2)))) {
			return -1;
		}
		

		return counter;
	}
	
	public static void main(String[] args) {
		String palabra = "XYXXYY";
		
		System.out.println(palabraDyc(palabra));

	}

}
