package application;

import java.util.Objects;

public class Oggetto {

	public String codice;
	public String descrizione;
	public String magazzino;
	public String categoria;

	/**
	 * @param codice
	 * @param descrizione
	 * @param magazzino
	 * @param categoria
	 */
	public Oggetto(String codice, String descrizione, String magazzino, String categoria) {

		this.codice = codice;
		this.descrizione = descrizione;
		this.magazzino = magazzino;
		this.categoria = categoria;
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
	 * @return the magazzino
	 */
	public String getMagazzino() {
		return magazzino;
	}

	/**
	 * @param magazzino the magazzino to set
	 */
	public void setMagazzino(String magazzino) {
		this.magazzino = magazzino;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, codice, descrizione, magazzino);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oggetto other = (Oggetto) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(codice, other.codice)
				&& Objects.equals(descrizione, other.descrizione) && Objects.equals(magazzino, other.magazzino);
	}

}
