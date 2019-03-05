
public class Losango extends Poligono {
	private int ladoA;
	
	public Losango(int base, int altura, int ladoA) {
		super(base, altura);
		this.ladoA = ladoA;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area()/2;
	}
	
	@Override
	double perimetro() {
		return 4*this.ladoA;
	}
}
