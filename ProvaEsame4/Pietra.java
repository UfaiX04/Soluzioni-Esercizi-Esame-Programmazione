/**
 * La classe Pietra rappresenta un oggetto pietra preziosa.
 * Estende la classe Prezioso e aggiunge un attributo carati.
 */
class Pietra extends Prezioso {
    private int carati;

    /**
     * Costruttore della classe Pietra.
     * 
     * @param peso il peso della pietra
     * @param carati il numero di carati della pietra
     * @throws IllegalArgumentException se il numero di carati non è un intero positivo
     */
    public Pietra(int peso, int carati) {
        super(peso);

        if (carati <= 0) {
            throw new IllegalArgumentException("Il numero di carati della pietra deve essere un intero positivo.");
        }

        this.carati = carati;
    }

    /**
     * Restituisce il numero di carati della pietra.
     * 
     * @return il numero di carati della pietra
     */
    public int getCarati() {
        return carati;
    }
}
