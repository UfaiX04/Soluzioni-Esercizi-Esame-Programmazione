/**
 * La classe Locomotiva rappresenta un tipo di vagone che funge da locomotiva.
 * Estende la classe Vagone e aggiunge un attributo per il numero di cavalli.
 */
public class Locomotiva extends Vagone {
    private int cavalli;

    /**
     * Costruisce un oggetto Locomotiva con il peso specificato e il numero di cavalli.
     * 
     * @param peso il peso del vagone
     * @param cavalli il numero di cavalli della locomotiva
     * @throws IllegalArgumentException se il numero di cavalli è minore o uguale a 0
     */
    public Locomotiva(int peso, int cavalli) {
        super(peso);
        if(cavalli <= 0) {
            throw new IllegalArgumentException("Locomotiva inesistente.");
        }
        this.cavalli = cavalli;
    }

    /**
     * Restituisce il numero di cavalli della locomotiva.
     * 
     * @return il numero di cavalli
     */
    public int getCavalli() {
        return cavalli;
    }
}
