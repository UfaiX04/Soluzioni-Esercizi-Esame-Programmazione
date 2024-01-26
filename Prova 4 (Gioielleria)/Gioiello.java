/**
 * Rappresenta un oggetto di gioielleria.
 * Un oggetto di gioielleria può avere più componenti preziose.
 */
class Gioiello {
    private Prezioso[] componenti;
    private int numComponenti;

    /**
     * Costruisce un oggetto di gioielleria con il numero massimo specificato di componenti.
     *
     * @param numMaxComponenti il numero massimo di componenti consentito per l'oggetto di gioielleria
     * @throws IllegalArgumentException se il numero massimo di componenti è inferiore a 1
     */
    public Gioiello(int numMaxComponenti) {
        if (numMaxComponenti < 1) {
            throw new IllegalArgumentException("Il numero massimo di componenti deve essere almeno 1.");
        }

        this.componenti = new Prezioso[numMaxComponenti];
        this.numComponenti = 0;
    }

    /**
     * Aggiunge una componente preziosa all'oggetto di gioielleria.
     *
     * @param prezioso la componente preziosa da aggiungere
     * @return true se la componente è stata aggiunta con successo, false se è stato raggiunto il numero massimo di componenti
     */
    public boolean add(Prezioso prezioso) {
        if (numComponenti < componenti.length) {
            componenti[numComponenti] = prezioso;
            numComponenti++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se il peso totale dei componenti in pietra preziosa è maggiore del peso complessivo dell'oggetto di gioielleria.
     *
     * @return true se il peso totale dei componenti in pietra preziosa è maggiore del peso complessivo dell'oggetto di gioielleria, false altrimenti
     */
    public boolean check() {
        int sommaCaratiPietre = caratiPietre();
        int pesoComplessivo = 0;

        for (int i = 0; i < numComponenti; i++) {
            pesoComplessivo += componenti[i].getPeso();
        }

        return sommaCaratiPietre > pesoComplessivo;
    }

    /**
     * Calcola il peso totale in carati delle componenti in pietra preziosa dell'oggetto di gioielleria.
     *
     * @return il peso totale in carati delle componenti in pietra preziosa
     */
    public int caratiPietre() {
        int sommaCarati = 0;

        for (int i = 0; i < numComponenti; i++) {
            if (componenti[i] instanceof Pietra) {
                sommaCarati += ((Pietra) componenti[i]).getCarati();
            }
        }

        return sommaCarati;
    }
}
