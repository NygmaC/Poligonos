
public abstract class Poligono extends Figura {
	
	private double base;
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double altura;
	
	public Poligono(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return this.base * this.altura;
	}
	
	@Override
	double perimetro() {
		return 0;
	}
	
	
	
	
}


