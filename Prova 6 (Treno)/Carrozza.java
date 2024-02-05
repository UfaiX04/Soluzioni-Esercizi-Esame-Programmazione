/**
 * La classe Carrozza rappresenta una carrozza di un treno.
 * Estende la classe Vagone e aggiunge un attributo per il numero di posti disponibili.
 */
public class Carrozza extends Vagone {
    private int posti;

    /**
     * Costruisce una nuova istanza di Carrozza con il peso specificato e il numero di posti disponibili.
     * Se il numero di posti è inferiore a 40 o superiore a 200, viene lanciata un'eccezione IllegalArgumentException.
     * 
     * @param peso il peso della carrozza
     * @param posti il numero di posti disponibili nella carrozza
     * @throws IllegalArgumentException se il numero di posti è inferiore a 40 o superiore a 200
     */
    public Carrozza(int peso, int posti) {
        super(peso);
        if(posti < 40 || posti > 200) {
            throw new IllegalArgumentException("Carrozza inesistente.");
        }
        this.posti = posti;
    }

    /**
     * Restituisce il numero di posti disponibili nella carrozza.
     * 
     * @return il numero di posti disponibili
     */
    public int getPosti() {
        return posti;
    }
}
