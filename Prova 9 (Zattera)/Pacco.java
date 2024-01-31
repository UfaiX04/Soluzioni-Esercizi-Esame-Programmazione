public class Pacco {
	private double peso;
	private Punto posizione;

	public Pacco(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("Il peso deve essere maggiore di zero");
		}
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public Punto getPosizione() {
		return posizione;
	}

	public void setPosizione(Punto posizione) {
		this.posizione = posizione;
	}
}