/**
 * La classe Prezioso rappresenta un oggetto prezioso con un determinato peso.
 */
class Prezioso {
    private int peso;

    /**
     * Costruisce un oggetto Prezioso con il peso specificato.
     * 
     * @param peso il peso dell'oggetto prezioso
     * @throws IllegalArgumentException se il peso specificato è minore o uguale a zero
     */
    public Prezioso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Il peso deve essere un intero positivo.");
        }
        this.peso = peso;
    }

    /**
     * Restituisce il peso dell'oggetto prezioso.
     * 
     * @return il peso dell'oggetto prezioso
     */
    public int getPeso() {
        return peso;
    }
}
