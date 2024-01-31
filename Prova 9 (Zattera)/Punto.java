public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	

	@Override
	public int hashCode() {
		int result = 17;
		long xBits = Double.doubleToLongBits(x);
		long yBits = Double.doubleToLongBits(y);
		result = 31 * result + (int) (xBits ^ (xBits >>> 32));
		result = 31 * result + (int) (yBits ^ (yBits >>> 32));
		return result;
	}

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