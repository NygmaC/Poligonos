
public class Circulo extends Figura {
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 3.14*Math.pow(this.raio,2);
	}
	
	@Override
	double perimetro() {
		return (2*this.raio)*3.14;
	}
	
}
