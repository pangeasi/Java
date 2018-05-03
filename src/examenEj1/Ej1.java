package examenEj1;

public class Ej1 {

	public static int palabraEscondida(String texto, String palabra) {
		int count = 0;
		int veces = 0;
		while(count < texto.length()) {
			count = texto.indexOf(palabra,count)+palabra.length();
			veces++;
		}
		
		return veces;
	}
	
	public static void main(String[] args) {
		String texto = "Aunque creáis que no, dentro de este yunque y dentro de maqueta está también que";
		String palabra = "que";
		
		System.out.println(palabraEscondida(texto, palabra));
		
	}

}
