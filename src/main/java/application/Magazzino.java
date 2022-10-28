/**
 * 
 */
package application;

import java.util.ArrayList;

/**
 * @author ghigo
 *
 */
public class Magazzino {

	private ArrayList<Oggetto> oggetti;
	private String descrizione;

	/**
	 * @param descrizione
	 */
	public Magazzino(String descrizione) {

		this.oggetti = new ArrayList<>();
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the oggetti
	 */
	public ArrayList<Oggetto> getOggetti() {
		return oggetti;
	}

	public boolean aggiungiOggetto(Oggetto oggetto) {

		if (oggetto.equals(null)) {
			return false;
		} else {
			oggetti.add(oggetto);
			return true;
		}
	}

	public boolean rimuoviOggetto(Oggetto oggetto) {

		if (oggetto.equals(null)) {
			return false;
		} else {
			oggetti.remove(oggetto);
			return true;
		}
	}

	public boolean consegnaOggetto(Oggetto oggetto, Cliente cliente) {

		if (oggetti.contains(oggetto)) {
			oggetti.remove(oggetto);
			cliente.riceve(oggetto);
			return true;
		} else {
			return false;
		}
	}

	public boolean riceviOggetto(Oggetto oggetto, Cliente cliente) {

		if (cliente.getMateriale().contains(oggetto)) {
			cliente.restituisce(oggetto);
			this.aggiungiOggetto(oggetto);
			return true;
		} else {
			return false;
		}
	}

}
