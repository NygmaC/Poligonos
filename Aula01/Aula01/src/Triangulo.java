
public class Triangulo extends Poligono {
	private int ladoA, ladoB, ladoC;
	
	public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC) {
		super(base, altura);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area()/2;
	}
	
	@Override
	double perimetro() {
		return this.ladoA + this.ladoB + this.ladoC;
	}
}
