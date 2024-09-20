package ar.edu.unlp.info.oo1.figuras_y_cuerpos;

public class Circulo extends Figura {
	
	private double radio ;
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return this.radio*2;
	}
	public void setDiametro(double diametro) {
	}

	public double getPerimetro() {
		return (Math.PI * this.getDiametro());
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(this.radio, 2));
	}
	
}
