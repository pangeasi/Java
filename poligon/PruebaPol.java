package poligon;

import javax.swing.JOptionPane;

public class PruebaPol {

	public static void main(String[] args) {
		Poligono p1 = new Poligono();
		Poligono p2 = new Poligono();
		Poligono p3 = new Poligono();
		
		
		p1.setN(Integer.parseInt((JOptionPane.showInputDialog("Introduce numero de vertices"))));
		p1.formarPoligono();
		System.out.println("El perimetro del poligono es: " + p1.perimetro());
		p2.setN(Integer.parseInt((JOptionPane.showInputDialog("Introduce numero de vertices"))));
		p2.formarPoligono();
		System.out.println("El perimetro del poligono es: " + p2.perimetro());
		p3.setN(Integer.parseInt((JOptionPane.showInputDialog("Introduce numero de vertices"))));
		p3.formarPoligono();
		System.out.println("El perimetro del poligono es: " + p3.perimetro());
		ComparatorForPoly c = new ComparatorForPoly();
		
		Poligono[] polis = new Poligono[] {p1,p2,p3};
		
		for(int i=0;i<polis.length-1;i++) {
			System.out.println(c.compare(polis[i], polis[i+1]));
		}
		

	}
	

}
