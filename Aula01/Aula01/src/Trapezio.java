
public class Trapezio extends Poligono{
	private int baseMenor;
	private int baseMaior;
	private int altura;
	private int ladoA, ladoB, ladoC, ladoD;
	
	public Trapezio(int base, int altura, int baseMenor, int ladoA, int ladoB, int ladoC, int ladoD) {
		super(base, altura);
		this.baseMenor = baseMenor;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
		
	}

	@Override
	double area() {
		
		return (super.getAltura() * (super.getBase() + this.baseMenor))/2;
	}
	
	@Override
	double perimetro() {
		return this.ladoA + this.ladoB + this.ladoC + this.ladoD;
	}
}
