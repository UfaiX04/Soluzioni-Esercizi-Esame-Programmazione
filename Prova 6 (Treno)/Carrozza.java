/**
 * Rappresenta una carrozza in un treno.
 * Estende la classe Vagone.
 */
public class Carrozza extends Vagone{
    private int posti;
    
    /**
     * Costruisce un oggetto Carrozza con i parametri specificati.
     * 
     * @param p il numero della carrozza
     * @param posti il numero di posti nella carrozza
     * @throws Exception se il numero di posti è inferiore a 40 o superiore a 200
     */
    public Carrozza(int p, int posti) throws Exception{
        super(p);
        if(posti < 40 || posti > 200) throw new IllegalArgumentException();
    }
    
    /**
     * Restituisce il numero di posti nella carrozza.
     * 
     * @return il numero di posti
     */
    public int getPosti() {return posti;}
}