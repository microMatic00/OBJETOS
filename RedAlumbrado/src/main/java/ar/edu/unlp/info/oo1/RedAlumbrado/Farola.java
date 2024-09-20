package ar.edu.unlp.info.oo1.RedAlumbrado;
import java.util.ArrayList;
import java.util.List;

public class Farola {

	private boolean on;
	private List<Farola> neighbors;
	
	/*
	 *  crear una farola inicializada como apagada
	 */
	
	public Farola () {
		this.neighbors = new ArrayList<Farola>();
		this.on = false;
	}
	
	/*
	 * crea la relacion de vecinos entre las farolas. La relacionde vecinos entre las farolas es reciproca, 
	 * es decir el receptor del msj sea vecino de otraFarola, al igual que otraFarola tambien se convertira en vecina del receptor del msj 
	 */
	
	
	public void pairWithNeighbor( Farola otraFarola) {
		
		if (!this.neighbors.contains(otraFarola)) {
			this.neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	/*
	 * retorna el vecindario 
	*/
	
	public List<Farola> getNeighbors (){
		return this.neighbors;
	}
	
	public void turnOn() {
		if (!this.isOn()) {
			this.on = true;
			this.getNeighbors().forEach(l -> l.turnOn());
		}
		
	}

	
	public void turnOff() {
      if (this.isOn()) {
        this.on = false;
        this.getNeighbors().forEach(l -> l.turnOff());
      }
	}
	

	/*retorna si farola encendida
	*/
	public boolean isOn() {
		return this.on;
	}


	}
	
	

