
public class Esfera extends Figura3D{
	private double raio;
	public Esfera(double raio) {
		this.raio = raio;
	}
	
	@Override
	double volume() {
		return 4*(3.14*Math.pow(this.raio,3))/3;
	}
}
