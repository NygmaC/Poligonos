
public abstract class Volume extends Figura{
	private double raio;
	private int expoente;
	private int multRaio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getExpoente() {
		return raio;
	}

	public void setExpoente(double raio) {
		this.raio = raio;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (this.multRaio*this.raio) * (Math.pow(3.14, this.expoente));
	}
	
}
