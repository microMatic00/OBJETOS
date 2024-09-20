package ar.edu.unlp.info.oo1.balanzaElectronica2024;

/*import java.time.LocalDate;

public class Balanza {
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	
	
	public double getPrecioTotal() {
		return precioTotal;
	}

	
	
	public double getPesoTotal() {
		return pesoTotal;
	}

	
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecioPorKilo();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket();
		ticket.setCantidadDeProductos(cantidadDeProductos);
		ticket.setPesoTotal(pesoTotal);
		ticket.setPrecioTotal(precioTotal);
		ticket.setFecha(LocalDate.now());
		return ticket;
		
	}
	
}*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
	
	private List<Producto> productos;

	public Balanza() {
		this.productos = new ArrayList<Producto>();
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	public int getCantidadDeProductos(){
		return this.productos.size();
	}
	
	
	
	public double getPrecioTotal(){
        
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	public double getPesoTotal(){
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();	}
	
	
	public void ponerEnCero () {
		this.productos.clear();
	}
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	
	/*public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
		return ticket;
	}*/
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal(),this.getProductos());
		return ticket;
	}
	


}

