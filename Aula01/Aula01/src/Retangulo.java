
public class Retangulo extends Poligono implements Diagonal{
	
	private int ladoA, ladoB;
	
	public Retangulo(int base, int altura, int ladoA, int ladoB) {
		super(base, altura);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area();
	}
	
	@Override
	double perimetro() {
		return 2*ladoA + 2*ladoB;
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt(getBase() * getBase() + getAltura() * getAltura());
	}
}
