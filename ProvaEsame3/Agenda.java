/**
 * La classe Agenda rappresenta un'agenda che può contenere una serie di appuntamenti.
 */
public class Agenda {
    private Appuntamento[] appuntamenti;
    private int numeroMassimoAppuntamenti;
    private int numeroAppuntamentiInseriti;

    /**
     * Costruisce un'istanza di Agenda con il numero massimo di appuntamenti specificato.
     * @param n il numero massimo di appuntamenti
     * @throws IllegalArgumentException se il numero massimo di appuntamenti è negativo
     */
    public Agenda(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Il numero massimo di appuntamenti non può essere negativo");
        }
        appuntamenti = new Appuntamento[n];
        numeroMassimoAppuntamenti = n;
        numeroAppuntamentiInseriti = 0;
    }

    /**
     * Aggiunge un appuntamento all'agenda.
     * @param a l'appuntamento da aggiungere
     * @return true se l'appuntamento è stato aggiunto con successo, false altrimenti
     */
    public boolean aggiungi(Appuntamento a) {
        if (a == null || numeroAppuntamentiInseriti == numeroMassimoAppuntamenti || contieneAppuntamento(a)) {
            return false;
        }

        int posizioneInserimento = 0;
        while (posizioneInserimento < numeroAppuntamentiInseriti && confrontaAppuntamenti(appuntamenti[posizioneInserimento], a) < 0) {
            posizioneInserimento++;
        }

        for (int i = numeroAppuntamentiInseriti; i > posizioneInserimento; i--) {
            appuntamenti[i] = appuntamenti[i - 1];
        }

        appuntamenti[posizioneInserimento] = a;
        numeroAppuntamentiInseriti++;
        return true;
    }

    /**
     * Cancella un appuntamento dall'agenda.
     * @param n l'indice dell'appuntamento da cancellare
     * @return true se l'appuntamento è stato cancellato con successo, false altrimenti
     */
    public boolean disdetta(int n) {
        if (n < 0 || n >= numeroAppuntamentiInseriti) {
            return false;
        }

        for (int i = n; i < numeroAppuntamentiInseriti - 1; i++) {
            appuntamenti[i] = appuntamenti[i + 1];
        }

        appuntamenti[numeroAppuntamentiInseriti - 1] = null;
        numeroAppuntamentiInseriti--;
        return true;
    }

    /**
     * Restituisce il numero di appuntamenti presenti nell'agenda.
     * @return il numero di appuntamenti
     */
    public int numeroAppuntamenti() {
        return numeroAppuntamentiInseriti;
    }

    /**
     * Restituisce l'appuntamento all'indice specificato.
     * @param i l'indice dell'appuntamento
     * @return l'appuntamento all'indice specificato, o null se l'indice è fuori dai limiti
     */
    public Appuntamento appuntamento(int i) {
        if (i < 0 || i >= numeroAppuntamentiInseriti) {
            return null;
        }
        return appuntamenti[i];
    }

    /**
     * Checks if the given appointment is present in the agenda.
     * 
     * @param a the appointment to be checked
     * @return true if the appointment is present, false otherwise
     */
    private boolean contieneAppuntamento(Appuntamento a) {
        for (int i = 0; i < numeroAppuntamentiInseriti; i++) {
            if (confrontaAppuntamenti(appuntamenti[i], a) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Compares two appointments based on their day and time.
     * 
     * @param a1 the first appointment to compare
     * @param a2 the second appointment to compare
     * @return a negative integer if a1 is before a2, a positive integer if a1 is after a2,
     *         or zero if they are equal
     */
    private int confrontaAppuntamenti(Appuntamento a1, Appuntamento a2) {
        if (a1.getGiorno() == a2.getGiorno()) {
            return Integer.compare(a1.getOra(), a2.getOra());
        } else {
            return Integer.compare(a1.getGiorno(), a2.getGiorno());
        }
    }
}
