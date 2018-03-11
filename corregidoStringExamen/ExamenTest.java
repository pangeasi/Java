package corregidoStringExamen;

import java.util.Arrays;

public class ExamenTest {

	public static String[] separarPalabrasYordenar(String texto) {
		String[] str = texto.split(" ");
		String word = "";
		String punct = " ";
		
		char[] c = null;
		
		for(int i=0; i<str.length;i++) {
			c = str[i].toCharArray();
			Arrays.sort(c);
			for(char l:c) {
				if(!Character.isAlphabetic(l)) {
					punct=l+" ";
				}else {
					word+=l;
				}
				
				
			}
			word+=punct;
			str[i] = word;
			word="";
			punct=" ";
		}
		return str;
	}
	
	public static void main(String[] args) {
		String texto = "En un lugar% de la mancha, de cuyo nombre";
		
		for(String palabra:separarPalabrasYordenar(texto)) {
			System.out.print(palabra);
		}
	}
}
