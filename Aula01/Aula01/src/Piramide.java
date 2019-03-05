
public class Piramide extends Figura3D{
	private Triangulo triangulo;
	
	public Piramide(Triangulo t) {
		this.triangulo = t;
	}
	
	@Override
	double volume() {
		return (this.triangulo.area()*this.triangulo.getAltura())/3;
	}
}
