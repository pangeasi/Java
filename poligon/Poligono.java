package poligon;

import javax.swing.JOptionPane;

public class Poligono {
	private int n=0;
	private Punto[] poligono1;
	
	public Poligono() {
		
	}
	
	
	public void formarPoligono() {
		poligono1 = new Punto[n];
		for(int i=0;i<poligono1.length;i++) {
			int x = Integer.parseInt((JOptionPane.showInputDialog("Introduce x")));
			int y = Integer.parseInt((JOptionPane.showInputDialog("Introduce y")));

			Punto pxy = new Punto(x,y);
			this.poligono1[i] = pxy;
		}
		
		for(Punto i:poligono1) {
			System.out.println(i);
		}
		
	}
	
	public int perimetro() {
		int perimetro = 0;
		for(int i=0;i<poligono1.length-1;i++) {
			perimetro += this.poligono1[i].distacioOtroPunto(this.poligono1[i+1]);
		}
		perimetro += this.poligono1[n-1].distacioOtroPunto(this.poligono1[0]);
		return perimetro;
		
	}
	public void setN(int n) {
		this.n=n;
	}
	public int getN() {
		return this.n;
	}
	
}
