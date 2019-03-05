
public class Cubo extends Figura3D{
	private Quadrado quad;
	
	public Cubo(Quadrado quad) {
		this.quad = quad;
	}
	
	@Override
	double volume() {
		return this.quad.area()*this.quad.getBase();
	}
}
