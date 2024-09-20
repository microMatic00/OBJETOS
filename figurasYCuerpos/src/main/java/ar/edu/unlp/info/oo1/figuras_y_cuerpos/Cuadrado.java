package ar.edu.unlp.info.oo1.figuras_y_cuerpos;

public class Cuadrado extends Figura {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return (this.lado*4);
	}
	
	public double getArea() {
		return (Math.pow(this.lado, 2));
	}
}
