/**
 * Classe astratta che rappresenta un vagone.
 */
public abstract class Vagone {
    private int peso;

    /**
     * Costruttore della classe Vagone.
     * 
     * @param peso il peso del vagone
     * @throws IllegalArgumentException se il peso è minore o uguale a 0
     */
    public Vagone(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Vagone inesistente.");
        }
        this.peso = peso;
    }

    /**
     * Restituisce il peso del vagone.
     * 
     * @return il peso del vagone
     */
    public int getPeso() {
        return peso;
    }
}
