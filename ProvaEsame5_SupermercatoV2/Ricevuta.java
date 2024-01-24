/**
 * La classe Ricevuta rappresenta una ricevuta di acquisto contenente una lista di prodotti.
 */
public class Ricevuta {
    private Prodotto[] listaArticoli;
    private int progressivo;
    private double prezzoTotale;

    /**
     * Costruttore della classe Ricevuta.
     * 
     * @param listaArticoli  l'array di prodotti contenuti nella ricevuta
     * @param progressivo    il numero progressivo della ricevuta
     * @param prezzoTotale   il prezzo totale della ricevuta
     */
    public Ricevuta(Prodotto[] listaArticoli, int progressivo, double prezzoTotale) {
        this.listaArticoli = listaArticoli;
        progressivo = 0;
        prezzoTotale = 0;
    }

    /**
     * Aggiunge un articolo alla lista della ricevuta.
     * 
     * @param p  il prodotto da aggiungere
     * @return   true se l'articolo è stato aggiunto con successo, false altrimenti
     */
    public boolean aggiungiArticolo(Prodotto p) {
        if(p == null) return false;
        if(progressivo == listaArticoli.length) return false;
        listaArticoli[progressivo++] = p;
        prezzoTotale += p.prezzo;
        return true;
    }

    /**
     * Rimuove un articolo dalla lista della ricevuta dato il suo codice.
     * 
     * @param codice  il codice dell'articolo da rimuovere
     * @return        true se l'articolo è stato rimosso con successo, false altrimenti
     */
    public boolean rimuoviArticolo(int codice) {
        if(codice < 0) return false;
        for(int i = 0; i < progressivo; i++) {
            if(listaArticoli[i].codice == codice) {
                prezzoTotale -= listaArticoli[i].prezzo;
                for(int j = i; j < progressivo - 1; j++) {
                    listaArticoli[j] = listaArticoli[j + 1];
                }
                progressivo--;
                return true;
            }
        }
        return false;
    }

    /**
     * Restituisce il prezzo totale della ricevuta.
     * 
     * @return  il prezzo totale della ricevuta
     */
    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    /**
     * Stampa la ricevuta, mostrando il numero progressivo, la lista degli articoli e il prezzo totale.
     */
    public void stampaRicevuta() {
        System.out.println("Ricevuta n. " + progressivo);
        for(int i = 0; i < progressivo; i++) {
            System.out.println(listaArticoli[i].nome + " " + listaArticoli[i].prezzo);
        }
        System.out.println("Totale: " + prezzoTotale);
    }
}