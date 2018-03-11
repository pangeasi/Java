package listasEnlazadas;

public class Punto {
private int x,y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public double distanciaOrigen(){
		double resultado = Math.sqrt(Math.pow(0 - this.x, 2) + Math.pow(0 - this.y, 2));
		return resultado;
	}
	
	public double distacioOtroPunto(Punto other){
		double resultado = Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
		return resultado;
	}
}
