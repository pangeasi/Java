package examenstring;

public class ExamenTest {

	public static String[] cadaPalabra(String texto) {
		String palabra = "";
		int n = 1;
		String[] palabras = new String[n];
		
		for(int i=0; i<texto.length();i++) {
			if(texto.indexOf(' ',i)>=0) {
				palabras[n-1] = palabra;
				palabras = aumentarArr(palabras,n);
				palabra = "";
				n++;
			}else {
				palabra += texto.substring(i, i+1);
				
			}
		}
		return palabras;
	}
	
	public static String[] aumentarArr(String[] p, int n) {
		String[] nuevoArr = new String[n+1];
		for(int i=0;i<p.length;i++) {
			nuevoArr[i] = p[i];
		}
		return nuevoArr;
	}
	
	public static void main(String[] args) {
		String texto = "En un lugar de la mancha";
		String[] arrTexto = cadaPalabra(texto);
		for(String i:arrTexto) {
			System.out.println(i);
		}
	}

}
