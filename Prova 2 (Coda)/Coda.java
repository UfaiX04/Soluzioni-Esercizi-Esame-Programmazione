/**
 * La classe Coda rappresenta una coda di visite mediche.
 * La coda ha una dimensione massima specificata al momento della creazione.
 * Le visite vengono inserite in coda e possono essere estratte o cancellate.
 */
public class Coda {
    private Visita[] coda;
    private int numeroPazienti;

    /**
     * Costruisce una nuova istanza di Coda con la dimensione massima specificata.
     * @param numeroMassimoElementi la dimensione massima della coda
     * @throws IllegalArgumentException se la dimensione massima è negativa
     */
    public Coda(int numeroMassimoElementi) throws IllegalArgumentException {
        if (numeroMassimoElementi < 0) {
            throw new IllegalArgumentException("Il numero massimo di elementi deve essere non negativo");
        }
        coda = new Visita[numeroMassimoElementi];
    }

    /**
     * Inserisce una visita in coda.
     * @param v la visita da inserire
     * @return true se l'inserimento è avvenuto con successo, false altrimenti
     */
    public boolean inserimento(Visita v) {
        if (v == null) {
            return false;
        }
        if(v.getNome().length() < 2 || v.getCognome().length() < 2 ) {
            return false;
        }
        if (numeroPazienti >= coda.length) {
            return false; // Numero massimo di posti disponibili raggiunto
        }
        System.err.println("Inserimento di " + v.getNome() + " " + v.getCognome());
        coda[numeroPazienti] = v;
        numeroPazienti++;
        return true;
    }

    /**
     * Estrae la visita in testa alla coda.
     * @return la visita estratta, o null se la coda è vuota
     */
    public Visita estrazione() {
        if (numeroPazienti == 0) {
            return null; // Nessun elemento presente
        }
        Visita elemento = coda[0];
        for (int i = 0; i < numeroPazienti - 1; i++) {
            coda[i] = coda[i + 1];
        }
        numeroPazienti--;
        return elemento;
    }

    /**
     * Cancella una visita dalla coda.
     * @param nome il nome della visita da cancellare
     * @param cognome il cognome della visita da cancellare
     * @return true se la visita è stata cancellata con successo, false altrimenti
     */
    public boolean cancellazione(String nome, String cognome) {
        int index = -1;
        for (int i = 0; i < numeroPazienti; i++) {
            if (coda[i].getNome().equals(nome) && coda[i].getCognome().equals(cognome)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numeroPazienti - 1; i++) {
                coda[i] = coda[i + 1];
            }
            coda[numeroPazienti - 1] = null;
            numeroPazienti--;
            return true;
        }
        return false;
    }
}
