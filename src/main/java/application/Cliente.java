package application;

import java.util.ArrayList;

public class Cliente {

	ArrayList<Oggetto> materiale;
	String descrizione;

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
}
