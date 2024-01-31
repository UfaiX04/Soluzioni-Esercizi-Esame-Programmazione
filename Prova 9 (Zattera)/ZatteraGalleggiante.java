public class ZatteraGalleggiante {
	private int altezza;
	private int larghezza;
	private Pacco[] pacchi;
	private int numPacchi;

	public ZatteraGalleggiante(int altezza, int larghezza) {
		if (altezza <= 0 || larghezza <= 0) {
			throw new IllegalArgumentException("Le dimensioni devono essere maggiori di zero");
		}
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.pacchi = new Pacco[100];
		this.numPacchi = 0;
	}

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

	public int getPesoTotale() {
		int pesoTotale = 0;
		for (int i = 0; i < numPacchi; i++) {
			pesoTotale += pacchi[i].getPeso();
		}
		return pesoTotale;
	}

	public double getPesoMedio() {
		if (numPacchi == 0) {
			return 0;
		}
		return (double) getPesoTotale() / numPacchi;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public int getAltezza() {
		return altezza;
	}

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