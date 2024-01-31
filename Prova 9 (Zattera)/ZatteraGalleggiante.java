/**
 * La classe ZatteraGalleggiante rappresenta una zattera galleggiante con dimensioni, pacchi e metodi per gestirli.
 */
public class ZatteraGalleggiante {
	private int altezza;
	private int larghezza;
	private Pacco[] pacchi;
	private int numPacchi;

	/**
	 * Costruisce una nuova istanza di ZatteraGalleggiante con le dimensioni specificate.
	 * 
	 * @param altezza l'altezza della zattera
	 * @param larghezza la larghezza della zattera
	 * @throws IllegalArgumentException se altezza o larghezza sono minori o uguali a zero
	 */
	public ZatteraGalleggiante(int altezza, int larghezza) {
		if (altezza <= 0 || larghezza <= 0) {
			throw new IllegalArgumentException("Le dimensioni devono essere maggiori di zero");
		}
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.pacchi = new Pacco[100];
		this.numPacchi = 0;
	}

	/**
	 * Aggiunge un pacco alla zattera in una determinata posizione.
	 * 
	 * @param pacco il pacco da aggiungere
	 * @param posizione la posizione in cui aggiungere il pacco
	 * @throws IllegalArgumentException se pacco o posizione sono null, o se la posizione è fuori dalle dimensioni della zattera, o se la zattera è piena
	 */
	public void aggiungiPacco(Pacco pacco, Punto posizione) {
		if (pacco == null || posizione == null) {
			throw new IllegalArgumentException("Il pacco o la posizione non possono essere null");
		}
		if (posizione.getX() < 0 || posizione.getX() >= larghezza || posizione.getY() < 0 || posizione.getY() >= altezza) {
			throw new IllegalArgumentException("La posizione è fuori dalle dimensioni della zattera");
		}
		if (numPacchi >= 100) {
			throw new IllegalArgumentException("La zattera è piena");
		}
		pacchi[numPacchi] = pacco;
		pacco.setPosizione(posizione);
		numPacchi++;
	}

	/**
	 * Restituisce il peso totale dei pacchi presenti nella zattera.
	 * 
	 * @return il peso totale dei pacchi
	 */
	public int getPesoTotale() {
		int pesoTotale = 0;
		for (int i = 0; i < numPacchi; i++) {
			pesoTotale += pacchi[i].getPeso();
		}
		return pesoTotale;
	}

	/**
	 * Restituisce il peso medio dei pacchi presenti nella zattera.
	 * 
	 * @return il peso medio dei pacchi
	 */
	public double getPesoMedio() {
		if (numPacchi == 0) {
			return 0;
		}
		return (double) getPesoTotale() / numPacchi;
	}

	/**
	 * Restituisce la larghezza della zattera.
	 * 
	 * @return la larghezza della zattera
	 */
	public int getLarghezza() {
		return larghezza;
	}

	/**
	 * Restituisce l'altezza della zattera.
	 * 
	 * @return l'altezza della zattera
	 */
	public int getAltezza() {
		return altezza;
	}

	/**
	 * Restituisce le coordinate del baricentro dei pacchi presenti nella zattera.
	 * 
	 * @return le coordinate del baricentro nel formato "x, y", o null se non ci sono pacchi nella zattera
	 */
	public String getBaricentro() {
		if (numPacchi == 0) {
			return null;
		}
		int sumX = 0;
		int sumY = 0;
		for (int i = 0; i < numPacchi; i++) {
			sumX += pacchi[i].getPosizione().getX();
			sumY += pacchi[i].getPosizione().getY();
		}
		int baricentroX = sumX / numPacchi;
		int baricentroY = sumY / numPacchi;
		return baricentroX + ", " + baricentroY;
	}
}