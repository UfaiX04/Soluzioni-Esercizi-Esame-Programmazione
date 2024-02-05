// Definisco la classe Serata con gli attributi richiesti
public class Serata {
    // Dichiaro le variabili di istanza
    private Artista[] artisti; // Un array di oggetti Artista per memorizzare gli artisti che si esibiranno
    private long giorno; // Il giorno in tempo di UNIX
    private int maxArtisti; // Il numero massimo di artisti che si possono esibire
    private int numSolisti; // Il numero di solisti presenti nell'array
    private int numGruppi; // Il numero di gruppi presenti nell'array
    private int indiceEsibizione; // L'indice dell'artista che si sta esibendo

    // Definisco il costruttore di Serata con i parametri corrispondenti
    public Serata(long giorno, int maxArtisti) {
        // Assegno i valori ai campi
        this.giorno = giorno;
        this.maxArtisti = maxArtisti;
        // Creo l'array di artisti con la dimensione data dal parametro maxArtisti
        this.artisti = new Artista[maxArtisti];
        // Inizializzo le altre variabili a zero
        this.numSolisti = 0;
        this.numGruppi = 0;
        this.indiceEsibizione = 0;
    }

    // Definisco il metodo nuovaEsibizione che inserisce un nuovo artista nella serata
    public void nuovaEsibizione(Artista a) {
        // Controllo che il parametro non sia nullo
        if (a == null) {
            // Se lo è, lancio un'eccezione di tipo IllegalArgumentException
            throw new IllegalArgumentException("Artista nullo");
        }
        // Controllo che ci sia ancora spazio nell'array di artisti
        if (numSolisti + numGruppi == maxArtisti) {
            // Se non lo è, lancio un'eccezione di tipo RuntimeException
            throw new RuntimeException("Non ci sono più posti disponibili per la serata");
        }
        // Controllo se l'artista è un gruppo o un solista
        if (a.isGruppo()) {
            // Se è un gruppo, lo inserisco alla fine dell'array
            artisti[maxArtisti - 1 - numGruppi] = a;
            // Incremento il numero di gruppi
            numGruppi++;
        } else {
            // Se è un solista, lo inserisco all'inizio dell'array
            artisti[numSolisti] = a;
            // Incremento il numero di solisti
            numSolisti++;
        }
    }

    // Definisco il metodo esibizioneInCorso che elimina l'esibizione che sta avvenendo e ritorna il prossimo artista in lista
    public Artista esibizioneInCorso() {
        // Controllo se la serata è finita
        if (indiceEsibizione == maxArtisti) {
            // Se lo è, ritorno null
            return null;
        }
        // Altrimenti, elimino l'artista che si sta esibendo dall'array
        artisti[indiceEsibizione] = null;
        // Incremento l'indice dell'esibizione
        indiceEsibizione++;
        // Ritorno l'artista che si esibirà dopo, se esiste
        return indiceEsibizione < maxArtisti ? artisti[indiceEsibizione] : null;
    }

    // Definisco il metodo eliminaEsibizione che elimina una determinata esibizione di un artista di cui è dato il nome d'arte
    public boolean eliminaEsibizione(String nomeArte) {
        // Controllo che il parametro non sia nullo o vuoto
        if (nomeArte == null || nomeArte.isEmpty()) {
            // Se lo è, lancio un'eccezione di tipo IllegalArgumentException
            throw new IllegalArgumentException("Nome d'arte non valido");
        }
        // Dichiaro una variabile booleana per indicare se ho trovato l'artista da eliminare
        boolean trovato = false;
        // Scorro l'array di artisti
        for (int i = 0; i < maxArtisti; i++) {
            // Controllo se l'artista corrente ha il nome d'arte uguale a quello dato
            if (artisti[i] != null && artisti[i].getNomeArte().equals(nomeArte)) {
                // Se lo ha, elimino l'artista dall'array
                artisti[i] = null;
                // Imposto la variabile trovato a true
                trovato = true;
                // Controllo se l'artista era un gruppo o un solista
                if (i >= maxArtisti - numGruppi) {
                    // Se era un gruppo, decremento il numero di gruppi
                    numGruppi--;
                } else {
                    // Se era un solista, decremento il numero di solisti
                    numSolisti--;
                }
                // Esco dal ciclo
                break;
            }
        }
        // Ritorno il valore della variabile trovato
        return trovato;
    }

    // Definisco i metodi getter per accedere ai valori degli attributi
    public Artista[] getArtisti() {
        return artisti;
    }

    public long getGiorno() {
        return giorno;
    }

    public int getMaxArtisti() {
        return maxArtisti;
    }

    public int getNumSolisti() {
        return numSolisti;
    }

    public int getNumGruppi() {
        return numGruppi;
    }

    public int getIndiceEsibizione() {
        return indiceEsibizione;
    }
}
