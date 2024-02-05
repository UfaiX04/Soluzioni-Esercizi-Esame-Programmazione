/**
 * La classe Punto rappresenta un punto nel piano cartesiano.
 */
public class Punto {
	
	private double x;
	private double y;
	
	/**
	 * Costruisce un nuovo oggetto Punto con le coordinate specificate.
	 * 
	 * @param x la coordinata x del punto
	 * @param y la coordinata y del punto
	 */
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Restituisce la coordinata x del punto.
	 * 
	 * @return la coordinata x del punto
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Restituisce la coordinata y del punto.
	 * 
	 * @return la coordinata y del punto
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Calcola l'hash code del punto.
	 * 
	 * @return l'hash code del punto
	 */
	@Override
	public int hashCode() {
		int result = 17;
		long xBits = Double.doubleToLongBits(x);
		long yBits = Double.doubleToLongBits(y);
		result = 31 * result + (int) (xBits ^ (xBits >>> 32));
		result = 31 * result + (int) (yBits ^ (yBits >>> 32));
		return result;
	}

	/**
	 * Verifica se l'oggetto specificato è uguale a questo punto.
	 * 
	 * @param obj l'oggetto da confrontare con questo punto
	 * @return true se l'oggetto specificato è uguale a questo punto, false altrimenti
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
}