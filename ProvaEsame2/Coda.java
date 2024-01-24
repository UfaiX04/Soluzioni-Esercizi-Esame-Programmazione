public class Coda {
    private Visita[] coda;
    private int numeroPazienti;

    public Coda(int numeroMassimoElementi) throws IllegalArgumentException {
        if (numeroMassimoElementi < 0) {
            throw new IllegalArgumentException("Il numero massimo di elementi deve essere non negativo");
        }
        coda = new Visita[numeroMassimoElementi];
    }

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
