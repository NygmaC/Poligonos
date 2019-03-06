import java.util.ArrayList;

public class Geometria {

		//NOME: LEONARDO CRISPIN DE OLIVEIRA
		//RA: 8181-9595

		
	public static void main(String[] args) {
		ArrayList<Figura> poligonos = new ArrayList<>();
		poligonos.add(new Triangulo(10, 2, 5, 5, 5));
		poligonos.add(new Quadrado(2, 2, 5));
		poligonos.add(new Losango(10, 1, 5));
		poligonos.add(new Retangulo(5, 5, 2, 2));
		poligonos.add(new Trapezio(5, 5, 5, 2, 2, 2, 2));
		poligonos.add(new Circulo(5));
		
		
		ArrayList<Figura3D> figuras3D = new ArrayList<Figura3D>();
		figuras3D.add(new Cilindro(2,10));
		figuras3D.add(new Cubo(new Quadrado(2,2,5)));
		figuras3D.add(new Piramide(new Triangulo(10, 2, 5, 5, 5)));
		figuras3D.add(new Esfera(5));
		
		for (Figura poligono : poligonos) {
			
			System.out.println("Area->" + poligono.area());
			System.out.println("Perimetro ->" + poligono.perimetro());
			
			if(poligono instanceof Diagonal) {
				System.out.println("Diagonal-> " + ((Diagonal) poligono).calculaDiagonal());
			}
			System.out.println();
			System.out.println();
		}
		
		for(Figura3D figura3D : figuras3D) {
			System.out.println("Volume -> " + figura3D.volume());
		}
		
		
		
		
		
		
		
		
	}
}
