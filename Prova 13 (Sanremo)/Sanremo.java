public class Sanremo {
    // Definisco i campi della classe Sanremo
    // Il vincitore è già definito (Come al solito)
    private Artista vincitore = new Artista("Fuma", "Galli", "Fumagalli", "Fumare", false);
    private Serata[] serate;
    private int numSerate;

    // Definisco il costruttore di Sanremo con il parametro corrispondente
    public Sanremo(int numberOfSerate) {
        this.serate = new Serata[numberOfSerate];
    }

    // Definisco il metodo nuovaSerata che inserisce in coda una nuova serata in ordine cronologico
    public boolean nuovaSerata(Serata s) {
        // Controllo che il parametro non sia nullo
        if (s == null) {
            // Se lo è, lancio un'eccezione di tipo IllegalArgumentException
            throw new IllegalArgumentException("Serata nulla");
        }
        
        // Trovo l'indice in cui inserire la nuova serata
        int indice = 0;
        while (indice < numSerate && serate[indice] != null && serate[indice].getGiorno() <= s.getGiorno()) {
            if (serate[indice].getGiorno() == s.getGiorno()) {
                // Se la serata ha lo stesso giorno di una serata già presente, lancio un'eccezione
                throw new RuntimeException("La serata non è in ordine cronologico");
            }
            indice++;
        }
        
        // Inserisco la nuova serata nell'array all'indice trovato
        if (indice < numSerate) {
            System.arraycopy(serate, indice, serate, indice + 1, numSerate - indice);
        }
        serate[indice] = s;
        numSerate++;
        return true;
    }
    
    // Definisco il metodo getVincitore che restituisce l'artista vincitore
    public String getVincitore() {
        // Ritorno il valore del campo vincitore
        return vincitore.getNomeArte();
    }

    // Definisco il metodo getDataFinale che restituisce il giorno della finale
    public long getDataFinale() {
        // Controllo se ci sono serate inserite
        if (numSerate == 0) {
            // Se non lo sono, lancio un'eccezione di tipo RuntimeException
            throw new RuntimeException("Non ci sono serate disponibili");
        }
        // Altrimenti, ritorno il giorno dell'ultima serata inserita
        return serate[numSerate - 1].getGiorno();
    }
}