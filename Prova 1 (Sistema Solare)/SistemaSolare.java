/**
 * Classe che rappresenta un sistema solare.
 */
public class SistemaSolare {
    private Pianeta[] pianeti;
    private int numeroPianeti;

    /**
     * Costruttore della classe SistemaSolare.
     * 
     * @param maxPianeti il numero massimo di pianeti che il sistema solare può contenere
     * @throws RuntimeException se il numero massimo di pianeti è negativo
     */
    public SistemaSolare(int maxPianeti) {
        if (maxPianeti < 0) {
            throw new RuntimeException("Il numero massimo di pianeti non può essere negativo");
        }
        pianeti = new Pianeta[maxPianeti];
        numeroPianeti = 0;
    }

    /**
     * Metodo per aggiungere un nuovo pianeta al sistema solare.
     * 
     * @param p il pianeta da aggiungere
     * @return true se il pianeta è stato aggiunto con successo, false altrimenti
     */
    /**
     * Metodo per aggiungere un nuovo pianeta al sistema solare.
     * 
     * @param p il pianeta da aggiungere
     * @return true se il pianeta è stato aggiunto con successo, false altrimenti
     */
    public boolean nuovo(Pianeta p) {
        int posizione = 0;
        // Trova la posizione corretta per inserire il nuovo pianeta in base alla sua distanza
        while (posizione < numeroPianeti && p.getDistanza() > pianeti[posizione].getDistanza()) {
            posizione++;
        }
        // Se la posizione è alla fine dell'array o se il pianeta è nullo o se l'array è pieno, restituisci false
        if (posizione == numeroPianeti) {
            if (p == null || numeroPianeti == pianeti.length) {
                return false;
            }
            // Inserisci il pianeta nella posizione corretta e incrementa il numero di pianeti
            pianeti[posizione] = p;
            numeroPianeti++;
            return true;
        }
        // Se la distanza del pianeta è uguale a quella del pianeta nella posizione corrente, restituisci false
        if (p.getDistanza() == pianeti[posizione].getDistanza()) {
            return false;
        }
        // Sposta tutti i pianeti successivi di una posizione verso la fine dell'array
        for (int i = numeroPianeti; i > posizione; i--) {
            pianeti[i] = pianeti[i - 1];
        }
        // Inserisci il pianeta nella posizione corretta e incrementa il numero di pianeti
        pianeti[posizione] = p;
        numeroPianeti++;
        return true;
    }
    
    /**
     * Metodo per ottenere il numero di pianeti nel sistema solare.
     * 
     * @return il numero di pianeti nel sistema solare
     */
    public int getNumero() {
        return numeroPianeti;
    }

    /**
     * Metodo per ottenere il pianeta in una determinata posizione.
     * 
     * @param n la posizione del pianeta
     * @return il pianeta nella posizione specificata, o null se la posizione è invalida
     */
    public Pianeta getPianeta(int n) {
        if (n < 0 || n >= numeroPianeti) {
            return null;
        }
        return pianeti[n];
    }

    /**
     * Metodo per ottenere il pianeta con la massa massima nel sistema solare.
     * 
     * @return il pianeta con la massa massima nel sistema solare, o null se non ci sono pianeti
     */
    public Pianeta getMaxPianeta() {
        if (numeroPianeti == 0) {
            return null;
        }
        Pianeta maxPianeta = pianeti[0];
        for (int i = 1; i < numeroPianeti; i++) {
            if (pianeti[i].getMassa() > maxPianeta.getMassa()) {
                maxPianeta = pianeti[i];
            }
        }
        return maxPianeta;
    }
}
