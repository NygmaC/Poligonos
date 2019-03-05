
public class Cilindro extends Figura3D{
	
	private double raio, altura;
	
	public Cilindro(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}
	
	@Override
	double volume() {
		return (3.14*Math.pow(this.raio,3))*this.altura;
	}
}
