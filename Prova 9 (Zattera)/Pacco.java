/**
 * La classe Pacco rappresenta un oggetto che contiene un peso e una posizione.
 */
public class Pacco {
	private double peso;
	private Punto posizione;

	/**
	 * Costruisce un nuovo oggetto Pacco con il peso specificato.
	 * 
	 * @param peso il peso del pacco
	 * @throws IllegalArgumentException se il peso è minore o uguale a zero
	 */
	public Pacco(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("Il peso deve essere maggiore di zero");
		}
		this.peso = peso;
	}

	/**
	 * Restituisce il peso del pacco.
	 * 
	 * @return il peso del pacco
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Restituisce la posizione del pacco.
	 * 
	 * @return la posizione del pacco
	 */
	public Punto getPosizione() {
		return posizione;
	}

	/**
	 * Imposta la posizione del pacco.
	 * 
	 * @param posizione la nuova posizione del pacco
	 */
	public void setPosizione(Punto posizione) {
		this.posizione = posizione;
	}
}