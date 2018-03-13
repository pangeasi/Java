package corregidoStringExamen;

public class Examen2Ev {
	
	public static String noEsta(String abc, String texto) {
		char[] c = abc.toCharArray();
		String result = "";
		for(int i=0;i<c.length;i++) {
			if(!(texto.indexOf(c[i]) >= 0)) {
				result+=c[i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String abc ="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String texto = "HOLAJAIME";
		System.out.println(noEsta(abc,texto));
	}
}
