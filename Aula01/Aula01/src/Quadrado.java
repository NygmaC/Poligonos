
public class Quadrado extends Poligono implements Diagonal {
	private int ladoA, ladoB, ladoC, ladoD;
	
	public Quadrado(int base, int altura, int ladoA) {
		super(base, altura);
		this.ladoA = ladoA;

	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area();
	}
	
	@Override
	double perimetro() {
		return 4*this.ladoA ;
	}

	@Override
	public double calculaDiagonal() {
		double a = Math.sqrt(Math.pow(getAltura(),2));
		return a*Math.sqrt(2);
	}
	

}
