// Definisco il metodo nuovaSerata che inserisce in coda una nuova serata in ordine cronologico
public void nuovaSerata(Serata s) {
    // Controllo che il parametro non sia nullo
    if (s == null) {
        // Se lo è, lancio un'eccezione di tipo IllegalArgumentException
        throw new IllegalArgumentException("Serata nulla");
    }
    // Dichiaro una variabile intera per indicare l'indice in cui inserire la serata
    int indice = 0;
    // Scorro l'array
    ...
// Definisco il metodo getVincitore che restituisce l'artista vincitore
    public Artista getVincitore() {
        // Ritorno il valore del campo vincitore
        return vincitore;
    }

// Definisco il metodo getDataFinale che restituisce il giorno della finale
    public long getDataFinale() {
        // Controllo se ci sono serate inserite
        if (serate[0] == null) {
            // Se non lo sono, lancio un'eccezione di tipo RuntimeException
            throw new RuntimeException("Non ci sono serate disponibili");
        }
        // Altrimenti, ritorno il giorno dell'ultima serata inserita
        return serate[numSerate - 1].getGiorno();
    }

// Definisco il metodo nuovaSerata che inserisce in coda una nuova serata in ordine cronologico
    public void nuovaSerata(Serata s) {
        // Controllo che il parametro non sia nullo
        if (s == null) {
            // Se lo è, lancio un'eccezione di tipo IllegalArgumentException
            throw new IllegalArgumentException("Serata nulla");
        }
        // Dichiaro una variabile intera per indicare l'indice in cui inserire la serata
        int indice = 0;
        // Scorro l'array di serate
        for (int i = 0; i < numSerate; i++) {
            // Controllo se la serata corrente è nulla
            if (serate[i] == null) {
                // Se lo è, ho trovato l'indice in cui inserire la nuova serata
                indice = i;
                // Esco dal ciclo
                break;
            }
            // Controllo se la serata corrente ha un giorno successivo a quello della nuova serata
            if (serate[i].getGiorno() > s.getGiorno()) {
                // Se lo ha, lancio un'eccezione di tipo RuntimeException
                throw new RuntimeException("La serata non è in ordine cronologico");
            }
        }
        // Inserisco la nuova serata nell'array all'indice trovato
        serate[indice] = s;
    }
