public class Agenda {
    private int appuntamentiMax;
    public Appuntamento[] appuntamenti;

    // Costruttore di default che crea un'agenda con massimo appuntamentiMax appuntamenti
    public Agenda(int appuntamentiMax) throws Exception {
        if (appuntamentiMax <= 0) {
            throw new RuntimeException("Numero di appuntamenti non valido");
        } else {
            this.appuntamentiMax = appuntamentiMax;
        }
    }

    // Aggiunge un appuntamento all'agenda
    public boolean Aggiungi(Appuntamento appuntamento) {
        if (appuntamento == null || appuntamenti.length == appuntamentiMax) {
            return false;
        } else {
            // Controlla se l'appuntamento è già presente
            for (int i = 0; i < appuntamenti.length; i++) {
                if( appuntamenti[i].getGiorno() == appuntamento.getGiorno() && appuntamenti[i].getOra() == appuntamento.getOra() ) {
                    return false;
                }
            }

            // Aggiungi l'appuntamento
            int index = 0;
            for (int i = 0; i < appuntamenti.length; i++) {
                if( appuntamenti[i].crono() < appuntamento.crono() ) {
                    index = i;
                }
            }

            // Sposta l'array
            for (int i = 0; i < appuntamenti.length; i++) {
                if( i == index ) {
                    appuntamenti[i] = appuntamento;
                } else {
                    appuntamenti[i] = appuntamenti[i+1];
                }
            }
            return true;
        }
    }

    // Rimuove l'n-esimo appuntamento piu vicino in ordine cronologico
    public boolean disdetta(int n) {
        if (n < 0 || n >= appuntamenti.length) {
            return false;
        } else {
            appuntamenti[n] = null;
            return true;
        }
    }

    // Ricava il numero totale di appuntamenti
    public int numeroAppuntamenti() {
        return appuntamenti.length;
    }

    // Ricava l'appuntamento in indice i
    Appuntamento appuntamento(int i) {
        return appuntamenti[i];
    }
}
