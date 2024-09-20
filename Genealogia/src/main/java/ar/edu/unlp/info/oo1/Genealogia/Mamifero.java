package ar.edu.unlp.info.oo1.Genealogia;

public class Mamifero extends Object{
	private String identificador;
	private String Especie;
	private java.time.LocalDate fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	public Mamifero() {}
	

	public Mamifero(String id) {
		this.identificador=id;
	}


	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return Especie;
	}
	public void setEspecie(String especie) {
		Especie = especie;
	}
	public java.time.LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(java.time.LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
		
	}
	
	
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null){
		return (this.padre.getPadre());
	}
			return null;}
	public Mamifero getAbuelaPaterna() {
		if (this.getMadre() != null){
		return (this.padre.getMadre());}
		return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getPadre() != null){
		return (this.madre.getPadre());}
		return null;
	}
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null) {
		return (this.madre.getMadre());}
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		boolean ancestro=false;
		if (this.madre != null) {
			if(this.madre.equals(mamifero)) {ancestro=true;}
			else ancestro= this.madre.tieneComoAncestroA(mamifero);
		}
		if ((!ancestro)&& (this.padre != null)){
			if(this.padre.equals(mamifero)) {ancestro=true;}
			else ancestro= this.padre.tieneComoAncestroA(mamifero);
		}
		
		return ancestro;
	}
	
}
