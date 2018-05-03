package examenEj3;

public class Ej3 {

	public static int[] obtenerCatalan(int a, int b) {
		double catalan = 0;
		String catalanesStr = "";
		double countInt = 0;

		
		while(catalan <= b) {
			catalan = (factorial(2*countInt))/(factorial(countInt+1)*factorial(countInt));
			if((int)catalan >= a && (int)catalan <= b) {
				catalanesStr += (int)catalan + ",";
			}
			countInt++;
		}
		catalanesStr = catalanesStr.substring(0,catalanesStr.length()-1);
		String[] catalanesArr = catalanesStr.split(",");
		
		int[] catalanes = new int[catalanesArr.length];
		
		for(int i=0;i<catalanes.length;i++) {
			catalanes[i] = Integer.parseInt(catalanesArr[i]);
		}
		return catalanes;
	}
	
	public static int eliminarNumerosCatalan(int[] conCatalan, int n, int a, int b) {

		int[] catalanes = obtenerCatalan(a, b);
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<catalanes.length;j++) {
				if(conCatalan[i] == catalanes[j]) {
					conCatalan[i] = -1;
					count++;
				}
			}
		}
		
		
		return n-count;
	}
	
	public static double factorial(double x) {
		double res = 1;
		for(double i=1;i<=x;i++) {
			res*=i;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int a = 132;
		int b = 16796;
		
		int[] catalanes = obtenerCatalan(a, b);
		

		for(int i:catalanes) {
			System.out.println(i);
		}
		
		System.out.println("\neliminación: ");
		
		int[] conCatalan = new int[] {14,15,132,1000,4862};
		System.out.println(eliminarNumerosCatalan(conCatalan, conCatalan.length, 132, 16796));
		
	}

}
