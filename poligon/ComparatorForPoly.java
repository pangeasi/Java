package poligon;

import java.util.Comparator;

public class ComparatorForPoly implements Comparator<Poligono> {

	@Override
	public int compare(Poligono arg0, Poligono arg1) {
		int p1 = arg0.perimetro();
		int p2 = arg1.perimetro();
		
		if(p1>p2) {
			return p1;
		}else {
			return p2;
		}
		
	}

}
