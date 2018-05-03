package examenej2;

public class Ej2 {

	public static int insertar(int[]a, int n, int dato, int max) {
		for(int i=1;i<n;i++) {
			if(a[0] <= max) {
				a[i]=dato;
				a[0]+=dato;
			}else {
				System.out.println("No hay más espacio");
				break;
			}
		}
		return n;
	}
	
	public static int eliminar(int[]a, int n, int dato) {
		for(int i=1;i<n;i++) {
			if(a[i] == dato) {
				a[i] = 0;
				System.out.println("Elemento encontrado");
				return n-1;
			}
		}
		System.out.println("Elemento no encontrado");
		return n;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {0,0,0,0,0};
		
		insertar(a, a.length, 2, 20);
		eliminar(a, a.length, 2);
	}

}
