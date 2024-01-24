/**
 * La classe Oro rappresenta un oggetto di tipo prezioso composto da oro.
 * Estende la classe Prezioso e aggiunge un attributo per i carati dell'oro.
 */
class Oro extends Prezioso {
    private int carati;

    /**
     * Costruttore della classe Oro.
     * 
     * @param peso il peso dell'oro in grammi
     * @param carati il numero di carati dell'oro (deve essere compreso tra 8 e 14)
     * @throws IllegalArgumentException se il numero di carati non è compreso tra 8 e 14
     */
    public Oro(int peso, int carati) {
        super(peso);

        if (carati < 8 || carati > 14) {
            throw new IllegalArgumentException("Il numero di carati dell'oro deve essere compreso tra 8 e 14.");
        }

        this.carati = carati;
    }

    /**
     * Restituisce il numero di carati dell'oro.
     * 
     * @return il numero di carati dell'oro
     */
    public int getCarati() {
        return carati;
    }
}
