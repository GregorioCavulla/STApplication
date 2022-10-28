package application;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author ghigo
 *
 */
public class Cliente {

	ArrayList<Oggetto> materiale;
	String descrizione;
	
	/**
	 * @param descrizione
	 */
	public Cliente(String descrizione) {

		materiale = new ArrayList<>();
		this.descrizione = descrizione;

	}

	/**
	 * @return the materiale
	 */
	public ArrayList<Oggetto> getMateriale() {
		return materiale;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	public boolean riceve(Oggetto oggetto) {

		if (oggetto.equals(null)) {
			return false;
		} else {
			materiale.add(oggetto);
			return true;
		}
	}

	public boolean restituisce(Oggetto oggetto) {

		if (materiale.contains(oggetto)) {
			materiale.remove(oggetto);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(descrizione, materiale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(descrizione, other.descrizione) && Objects.equals(materiale, other.materiale);
	}
	
	
}
