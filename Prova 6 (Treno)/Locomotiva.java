/**
 * La classe Locomotiva rappresenta un vagone di tipo locomotiva.
 * Estende la classe Vagone e aggiunge un attributo per il numero di cavalli.
 */
public class Locomotiva extends Vagone{
    private int cavalli;

    /**
     * Costruttore della classe Locomotiva.
     * @param p il peso del vagone
     * @param cavalli il numero di cavalli della locomotiva
     * @throws Exception se il numero di cavalli è negativo
     */
    public Locomotiva(int p, int cavalli) throws Exception {
        super(p);
        if(cavalli < 0) throw new IllegalArgumentException("Argomento non valido");
        else this.cavalli = cavalli;
    }

    /**
     * Restituisce il numero di cavalli della locomotiva.
     * @return il numero di cavalli
     */
    public int getCavalli() {return cavalli;}
}